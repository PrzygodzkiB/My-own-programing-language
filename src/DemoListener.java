// Generated from D:/Infa sem1/2Jezyki formalne i kompilatory/laby/moj_projekt\Demo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DemoParser}.
 */
public interface DemoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DemoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DemoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DemoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#newblock}.
	 * @param ctx the parse tree
	 */
	void enterNewblock(DemoParser.NewblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#newblock}.
	 * @param ctx the parse tree
	 */
	void exitNewblock(DemoParser.NewblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DemoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DemoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printstring}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterPrintstring(DemoParser.PrintstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printstring}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitPrintstring(DemoParser.PrintstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DemoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DemoParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterRead(DemoParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitRead(DemoParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functioncall}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall(DemoParser.FunctioncallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functioncall}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall(DemoParser.FunctioncallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaratestring}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratestring(DemoParser.DeclaratestringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaratestring}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratestring(DemoParser.DeclaratestringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_ID}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterSingle_ID(DemoParser.Single_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_ID}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitSingle_ID(DemoParser.Single_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_and_else}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterIf_and_else(DemoParser.If_and_elseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_and_else}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitIf_and_else(DemoParser.If_and_elseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterIf(DemoParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitIf(DemoParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(DemoParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link DemoParser#start}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(DemoParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DemoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DemoParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#fblock}.
	 * @param ctx the parse tree
	 */
	void enterFblock(DemoParser.FblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#fblock}.
	 * @param ctx the parse tree
	 */
	void exitFblock(DemoParser.FblockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(DemoParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(DemoParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(DemoParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(DemoParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSub(DemoParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link DemoParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSub(DemoParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(DemoParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(DemoParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(DemoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(DemoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(DemoParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link DemoParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(DemoParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(DemoParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(DemoParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterReal(DemoParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitReal(DemoParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterId(DemoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitId(DemoParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(DemoParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(DemoParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(DemoParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(DemoParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(DemoParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(DemoParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functioncall_in_expr}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterFunctioncall_in_expr(DemoParser.Functioncall_in_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functioncall_in_expr}
	 * labeled alternative in {@link DemoParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitFunctioncall_in_expr(DemoParser.Functioncall_in_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarateint}
	 * labeled alternative in {@link DemoParser#var}.
	 * @param ctx the parse tree
	 */
	void enterDeclarateint(DemoParser.DeclarateintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarateint}
	 * labeled alternative in {@link DemoParser#var}.
	 * @param ctx the parse tree
	 */
	void exitDeclarateint(DemoParser.DeclarateintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaratereal}
	 * labeled alternative in {@link DemoParser#var}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratereal(DemoParser.DeclaraterealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaratereal}
	 * labeled alternative in {@link DemoParser#var}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratereal(DemoParser.DeclaraterealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code just_id}
	 * labeled alternative in {@link DemoParser#var}.
	 * @param ctx the parse tree
	 */
	void enterJust_id(DemoParser.Just_idContext ctx);
	/**
	 * Exit a parse tree produced by the {@code just_id}
	 * labeled alternative in {@link DemoParser#var}.
	 * @param ctx the parse tree
	 */
	void exitJust_id(DemoParser.Just_idContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is_equal}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 */
	void enterIs_equal(DemoParser.Is_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is_equal}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 */
	void exitIs_equal(DemoParser.Is_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is_not_equal}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 */
	void enterIs_not_equal(DemoParser.Is_not_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is_not_equal}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 */
	void exitIs_not_equal(DemoParser.Is_not_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is_greater}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 */
	void enterIs_greater(DemoParser.Is_greaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is_greater}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 */
	void exitIs_greater(DemoParser.Is_greaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is_less}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 */
	void enterIs_less(DemoParser.Is_lessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is_less}
	 * labeled alternative in {@link DemoParser#icmp}.
	 * @param ctx the parse tree
	 */
	void exitIs_less(DemoParser.Is_lessContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DemoParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DemoParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockif(DemoParser.BlockifContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockif(DemoParser.BlockifContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#blockif_and_else}.
	 * @param ctx the parse tree
	 */
	void enterBlockif_and_else(DemoParser.Blockif_and_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#blockif_and_else}.
	 * @param ctx the parse tree
	 */
	void exitBlockif_and_else(DemoParser.Blockif_and_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#block_else}.
	 * @param ctx the parse tree
	 */
	void enterBlock_else(DemoParser.Block_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#block_else}.
	 * @param ctx the parse tree
	 */
	void exitBlock_else(DemoParser.Block_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void enterRepetitions(DemoParser.RepetitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#repetitions}.
	 * @param ctx the parse tree
	 */
	void exitRepetitions(DemoParser.RepetitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DemoParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DemoParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DemoParser#funid}.
	 * @param ctx the parse tree
	 */
	void enterFunid(DemoParser.FunidContext ctx);
	/**
	 * Exit a parse tree produced by {@link DemoParser#funid}.
	 * @param ctx the parse tree
	 */
	void exitFunid(DemoParser.FunidContext ctx);
}