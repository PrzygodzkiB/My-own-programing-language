
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

enum VarType {INT, REAL, STRING, UNKNOWN}

class Value {
    public String name;
    public VarType type;

    public Value(String name, VarType type) {
        this.name = name;
        this.type = type;
    }
}

public class LLVMActions extends DemoBaseListener {
    //zmienne
    HashMap<String, VarType> variables = new HashMap<String, VarType>();//tablica zmiennych zeby je pamietac zmianna sa z typem
    HashMap<String, VarType> variables_local = new HashMap<String, VarType>();//zmienne lokalne TO DO
    Boolean global;

    //stos do obliczeń artmetycznych
    Stack<Value> stack = new Stack<Value>();//stack

    //stringi
    HashMap<String, String> StringSet = new HashMap<String, String>();//HasmMapa na zawartość stringow
    int number = 0;//iterator do nieznanych stringow

    //funkcje
    HashSet<String> functions = new HashSet<String>();


    @Override
    public void enterProg(DemoParser.ProgContext ctx) {
        global = true;
    }

    @Override
    public void exitProg(DemoParser.ProgContext ctx) {
        System.out.println(LLVMGenerator.generate(StringSet));
    }//na koncu podajemy Stringi i konczymy pisanie programu



    /////// funkcje

    @Override
    public void enterFunid(DemoParser.FunidContext ctx) {
        String ID = ctx.ID().getText();
        if (!functions.contains(ID)) {
            functions.add(ID);
            LLVMGenerator.function_start(ID);
        } else {
            error(ctx.getStart().getLine(), "Function " + ID + " already exist");
        }
    }

    @Override
    public void enterFblock(DemoParser.FblockContext ctx) {
        global = false;
    }
    public String find_variable(String ID){//tu trzeba juz wiedziec ze gdzies jest funkcja
        String load_arg="";
        if( variables_local.containsKey(ID) ){
            load_arg = "%"+ID;
        }
        else if(variables.containsKey(ID)) {
            load_arg = "@"+ID;
        }
        else{
            System.err.println("Error variable"+ ID +"not found");
            System.exit(1);
        }
        return load_arg;
    }


    @Override
    public void exitFunction(DemoParser.FunctionContext ctx){
        if(ctx.value().ID()!=null){
            String ID = ctx.value().ID().getText();
            if (!variables.containsKey(ID)&&!variables_local.containsKey(ID)){
                error(ctx.getStart().getLine(), "Unknown variable " + ID);
            }
            if(variables.get(ID)==VarType.INT || variables_local.get(ID)==VarType.INT){
                LLVMGenerator.load_i32(find_variable(ID));
                LLVMGenerator.function_end("%" + (LLVMGenerator.reg - 1));
            }else{
                error(ctx.getStart().getLine(), ID + " must be int");
            }


        }else{

            LLVMGenerator.function_end(ctx.value().getText());
        }

        variables_local = new HashMap<String, VarType>();
        global = true;
    }

    @Override
    public void exitFunctioncall(DemoParser.FunctioncallContext ctx) {

        String ID = ctx.ID().getText();
        if(functions.contains(ID)) {
            LLVMGenerator.call_function(ID);
        } else {
            error(ctx.getStart().getLine(), "function "+ID + " not defined");
        }
    }
    /////////

    @Override
    public void exitAssign(DemoParser.AssignContext ctx) { //assaing bo tak nazwalismy w komentarzu
        String ID = ctx.var().getChild(ctx.var().children.size() - 1).getText();//tak udalo nam sie dostac zawsze do ID
        Value v = stack.pop();

        if (!variables.containsKey(ID)&&!variables_local.containsKey(ID)) {
            error(ctx.getStart().getLine(), "Unknown variable " + ID);
        }

        if (!(variables.get(ID) == v.type||variables_local.get(ID) == v.type)) {//NOR
            error(ctx.getStart().getLine(), "variable type mismatch" + ID);
        }
        if (v.type == VarType.INT) {
            LLVMGenerator.assign_i32(find_variable(ID), v.name);
        } // jezeli nie ma zmiennej to ja dodac
        if (v.type == VarType.REAL) {// to sie dzieje w pliku LLVMGenerator
            LLVMGenerator.assign_double(find_variable(ID), v.name);
        }
    }
/////////////if
    @Override
    public void enterBlockif(DemoParser.BlockifContext ctx) {
        LLVMGenerator.ifstart();
    }

    @Override
    public void exitBlockif(DemoParser.BlockifContext ctx) {
        LLVMGenerator.ifend();
    }

    @Override
    public void enterBlockif_and_else(DemoParser.Blockif_and_elseContext ctx) {
        LLVMGenerator.ifBlockif_and_else_start();

    }
    @Override
    public void exitBlockif_and_else(DemoParser.Blockif_and_elseContext ctx) {
        LLVMGenerator.ifBlockif_and_else_end();

    }
    @Override
    public void exitBlock_else(DemoParser.Block_elseContext ctx) {
        LLVMGenerator.ifexitBlock_else();
    }
    @Override
    public void enterIs_equal(DemoParser.Is_equalContext ctx) {
        String ID = ctx.ID().getText();
        String number = ctx.number().getText();
        if( variables.containsKey(ID) ) {
            if (variables.get(ID)==VarType.INT)
            {
                LLVMGenerator.icmp_int( find_variable(ID), number );
            }else if(variables.get(ID)==VarType.REAL){

                LLVMGenerator.icmp_real( find_variable(ID), number );

            }else {
                ctx.getStart().getLine();
                System.err.println("Line "+ ctx.getStart().getLine()+", prohibited type: "+ID);

            }

        } else if (variables_local.containsKey(ID)){
            if (variables_local.get(ID)==VarType.INT)
            {
                LLVMGenerator.icmp_int( find_variable(ID), number );
            }else if(variables_local.get(ID)==VarType.REAL){

                LLVMGenerator.icmp_real( find_variable(ID), number );

            }else {
                ctx.getStart().getLine();
                System.err.println("Line "+ ctx.getStart().getLine()+", prohibited type: "+ID);

            }

        }
            else {
            ctx.getStart().getLine();
            System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
        }
    }
    @Override public void enterIs_not_equal(DemoParser.Is_not_equalContext ctx) {
        String ID = ctx.ID().getText();
        String number = ctx.number().getText();
        if( variables.containsKey(ID) ) {
            if (variables.get(ID)==VarType.INT)
            {
                LLVMGenerator.icmp_ne_int( find_variable(ID), number );
            }else if(variables.get(ID)==VarType.REAL){

                LLVMGenerator.icmp_ne_real( find_variable(ID), number );

            }else {
                ctx.getStart().getLine();
                System.err.println("Line "+ ctx.getStart().getLine()+", prohibited type: "+ID);

            }

        } else if (variables_local.containsKey(ID)){
            if (variables_local.get(ID)==VarType.INT)
            {
                LLVMGenerator.icmp_ne_int( find_variable(ID), number );
            }else if(variables_local.get(ID)==VarType.REAL){

                LLVMGenerator.icmp_ne_real( find_variable(ID), number );

            }else {
                ctx.getStart().getLine();
                System.err.println("Line "+ ctx.getStart().getLine()+", prohibited type: "+ID);

            }

        }
        else {
            ctx.getStart().getLine();
            System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
        }
    }

    @Override public void enterIs_greater(DemoParser.Is_greaterContext ctx) {
        String ID = ctx.ID().getText();
        String number = ctx.number().getText();
        if( variables.containsKey(ID) ) {
            if (variables.get(ID)==VarType.INT)
            {
                LLVMGenerator.icmp_gr_int( find_variable(ID), number );
            }else if(variables.get(ID)==VarType.REAL){

                LLVMGenerator.icmp_gr_real( find_variable(ID), number );

            }else {
                ctx.getStart().getLine();
                System.err.println("Line "+ ctx.getStart().getLine()+", prohibited type: "+ID);

            }

        }else if (variables_local.containsKey(ID)){
            if (variables_local.get(ID)==VarType.INT)
            {
                LLVMGenerator.icmp_gr_int( find_variable(ID), number );
            }else if(variables_local.get(ID)==VarType.REAL){

                LLVMGenerator.icmp_gr_real( find_variable(ID), number );

            }else {
                ctx.getStart().getLine();
                System.err.println("Line "+ ctx.getStart().getLine()+", prohibited type: "+ID);

            }

        }
        else {
            ctx.getStart().getLine();
            System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
        }
    }

    @Override public void enterIs_less(DemoParser.Is_lessContext ctx) {
        String ID = ctx.ID().getText();
        String number = ctx.number().getText();
        if( variables.containsKey(ID) ) {
            if (variables.get(ID)==VarType.INT)
            {
                LLVMGenerator.icmp_less_int( find_variable(ID), number );
            }else if(variables.get(ID)==VarType.REAL){

                LLVMGenerator.icmp_less_real( find_variable(ID), number );

            }else {
                ctx.getStart().getLine();
                System.err.println("Line "+ ctx.getStart().getLine()+", prohibited type: "+ID);

            }

        } else if (variables_local.containsKey(ID)){
            if (variables_local.get(ID)==VarType.INT)
            {
                LLVMGenerator.icmp_less_int( find_variable(ID), number );
            }else if(variables_local.get(ID)==VarType.REAL){

                LLVMGenerator.icmp_less_real( find_variable(ID), number );

            }else {
                ctx.getStart().getLine();
                System.err.println("Line "+ ctx.getStart().getLine()+", prohibited type: "+ID);

            }

        }
        else {
            ctx.getStart().getLine();
            System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
        }
    }
//////////////// loop
@Override
public void exitRepetitions(DemoParser.RepetitionsContext ctx) {
    String iterator = "";
    if (ctx.INT() != null) {
        iterator = ctx.INT().getText();
    }
    else if(ctx.ID() != null) {
        String ID = ctx.ID().getText();
        if(variables.containsKey(ID) ||variables_local.containsKey(ID)) {

            VarType type=null;
            if(variables.containsKey(ID)) {
                type = variables.get(ID);
            }
            if(variables_local.containsKey(ID)) {
                type = variables_local.get(ID);
            }
            if(type==VarType.INT) {
                LLVMGenerator.load_i32(find_variable(ID));
                iterator = "%" + (LLVMGenerator.reg - 1);
            } else {
                error(ctx.getStart().getLine(), "Iterator must be int type");
            }
        } else {
            ctx.getStart().getLine();
            System.err.println("Line "+ ctx.getStart().getLine()+", unknown variable: "+ID);
        }
    }
    LLVMGenerator.repeatStart(iterator);
}

    @Override
    public void exitNewblock(DemoParser.NewblockContext ctx) {
        if( ctx.getParent() instanceof DemoParser.RepeatContext ){
            LLVMGenerator.repeatend();
        }
    }
    @Override
    public void exitDeclaratereal(DemoParser.DeclaraterealContext ctx) {
        String ID = ctx.ID().getText();

        if(global) {
            if (variables.containsKey(ID)) {
                error(ctx.getStart().getLine(), "multi declaration " + ID);
            }
            LLVMGenerator.declare_double(ID, global);
            variables.put(ID, VarType.REAL);
            LLVMGenerator.assign_double(find_variable(ID), "0.0");//przypisujemy do nowych zmiennych 0

        }else{
            if (variables_local.containsKey(ID)) {
                error(ctx.getStart().getLine(), "multi declaration " + ID);
            }
            LLVMGenerator.declare_double(ID, global);
            variables_local.put(ID, VarType.REAL);
            LLVMGenerator.assign_double(find_variable(ID), "0.0");//przypisujemy do nowych zmiennych 0

        }
    }

    @Override
    public void exitDeclarateint(DemoParser.DeclarateintContext ctx) {
        String ID = ctx.ID().getText();
        if(global) {
            if (variables.containsKey(ID)) {
                error(ctx.getStart().getLine(), "multi declaration " + ID);
            }
            LLVMGenerator.declare_i32(ID, global);
            variables.put(ID, VarType.INT);
            LLVMGenerator.assign_i32(find_variable(ID), "0");

        }else{
            if (variables_local.containsKey(ID)) {
                error(ctx.getStart().getLine(), "multi declaration " + ID);
            }
            LLVMGenerator.declare_i32(ID, global);
            variables_local.put(ID, VarType.INT);
            LLVMGenerator.assign_i32(find_variable(ID), "0");

        }
    }

    @Override
    public void exitDeclaratestring(DemoParser.DeclaratestringContext ctx) {
        String ID = ctx.ID().getText();
        String value = ctx.STRING().getText();
        if (variables.containsKey(ID)) {
            error(ctx.getStart().getLine(), "multi declaration " + ID);
        }
        variables.put(ID, VarType.STRING);
        StringSet.put(ID, value);
        LLVMGenerator.declare_string(ID, value.length() - 2);//minus 2 bo odejmujemy ""
    }



    // to robimy przy wyjsciu
    @Override
    public void exitInt(DemoParser.IntContext ctx) {
        stack.push(new Value(ctx.INT().getText(), VarType.INT));
    }

    @Override
    public void exitReal(DemoParser.RealContext ctx) {
        stack.push(new Value(ctx.REAL().getText(), VarType.REAL));
    }

    @Override
    public void exitId(DemoParser.IdContext ctx) {
        String ID = ctx.ID().getText();

        if (!variables.containsKey(ID) && !variables_local.containsKey(ID)) {
            error(ctx.getStart().getLine(), "unknow virable");
        } else {
            if (variables_local.containsKey(ID)) {
                VarType type = variables_local.get(ID);
                if (type == VarType.INT) {
                    LLVMGenerator.load_i32(find_variable(ID));
                    stack.push(new Value("%" + (LLVMGenerator.reg - 1), type));
                } else if (type == VarType.REAL) {
                    LLVMGenerator.load_double(find_variable(ID));
                    stack.push(new Value("%" + (LLVMGenerator.reg - 1), type));
                }
            } else {
                VarType type = variables.get(ID);
                if (type == VarType.INT) {
                    LLVMGenerator.load_i32(find_variable(ID));
                    stack.push(new Value("%" + (LLVMGenerator.reg - 1), type));
                } else if (type == VarType.REAL) {
                    LLVMGenerator.load_double(find_variable(ID));
                    stack.push(new Value("%" + (LLVMGenerator.reg - 1), type));
                }
            }
        }
    }

    @Override public void enterFunctioncall_in_expr(DemoParser.Functioncall_in_exprContext ctx) {
        String name = ctx.ID().getText();
        if (!functions.contains(name)) {
            error(ctx.getStart().getLine(), "unknow function");
        } else {
            LLVMGenerator.call_function(name);
            stack.push(new Value("%" + (LLVMGenerator.reg - 1),  VarType.INT));
        }//funkcje sa proste i wzracaja tylko inta


    }

    @Override
    public void exitAdd(DemoParser.AddContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {

                LLVMGenerator.add_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.add_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "add type mismatch");
        }
    }

    @Override
    public void exitSub(DemoParser.SubContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {

                LLVMGenerator.sub_i32(v2.name, v1.name);//na odwrot
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.sub_double(v2.name, v1.name);//na odwrot
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "sub type mismatch");
        }
    }

    @Override
    public void exitMult(DemoParser.MultContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.mult_i32(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.mult_double(v1.name, v2.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "mult type mismatch");
        }
    }

    @Override
    public void exitDiv(DemoParser.DivContext ctx) {
        Value v1 = stack.pop();
        Value v2 = stack.pop();
        if (v1.type == v2.type) {
            if (v1.type == VarType.INT) {
                LLVMGenerator.div_i32(v2.name, v1.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
            }
            if (v1.type == VarType.REAL) {
                LLVMGenerator.div_double(v2.name, v1.name);
                stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
            }
        } else {
            error(ctx.getStart().getLine(), "div type mismatch");
        }
    }

    @Override
    public void exitToint(DemoParser.TointContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.fptosi(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.INT));
    }

    @Override
    public void exitToreal(DemoParser.TorealContext ctx) {
        Value v = stack.pop();
        LLVMGenerator.sitofp(v.name);
        stack.push(new Value("%" + (LLVMGenerator.reg - 1), VarType.REAL));
    }

    @Override
    public void exitPrint(DemoParser.PrintContext ctx) {
        String ID = ctx.ID().getText();
        VarType type=null;
        if(variables.containsKey(ID)) {
            type = variables.get(ID);
        }
        if(variables_local.containsKey(ID)) {
            type = variables_local.get(ID);
        }

        if (type != null) {
            if (type == VarType.INT) {
                LLVMGenerator.printf_i32(find_variable(ID));
            }
            if (type == VarType.REAL) {
                LLVMGenerator.printf_double(find_variable(ID));
            }
            if (type == VarType.STRING) { // wypisz string
                LLVMGenerator.printf_string(ID, StringSet.get(ID).length() - 2);
            }
        } else {
            error(ctx.getStart().getLine(), "unknown variable " + ID);
        }
    }

    @Override
    public void exitPrintstring(DemoParser.PrintstringContext ctx) {
        String string = ctx.STRING().getText(); // pobierz tekst do wypisania
        number++;

        String ID = "unknow_" + number;
        StringSet.put(ID, string);
        LLVMGenerator.printf_only_string(ID, string.length() - 2);


    }

    @Override
    public void exitRead(DemoParser.ReadContext ctx) {
        String ID = ctx.ID().getText();

        if (!variables.containsKey(ID)&&!variables_local.containsKey(ID)) {
            error(ctx.getStart().getLine(), "unknow virable read");
        } else {
            VarType type=null;
            if(variables.containsKey(ID)) {
                type = variables.get(ID);
            }
            if(variables_local.containsKey(ID)) {
                type = variables_local.get(ID);
            }
            if (type == VarType.INT) {
                LLVMGenerator.scanf_int(find_variable(ID));
            } else if (type == VarType.REAL) {
                LLVMGenerator.scanf_real(find_variable(ID));
            } else {
                error(ctx.getStart().getLine(), "Read type mismatch");
            }
        }
    }

    void error(int line, String msg) {
        System.err.println("Error, line " + line + ", " + msg);
        System.exit(1);
    }

}
