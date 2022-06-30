import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

class LLVMGenerator{
   
   static String header_text = "";
   static String block_text = "";
   static String main_text = "";
   static int reg = 1;
   static int br = 0;
   static int main_reg = 1;

   static Stack<Integer> brstack = new Stack<Integer>();

   static void printf_i32(String id){
      block_text += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %"+(reg-1)+")\n";
      reg++;
   }

   static void printf_double(String id){
      block_text += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpd, i32 0, i32 0), double %"+(reg-1)+")\n";
      reg++;
   }
   public static void printf_string(String id, int size) {
      block_text += "%" + reg + " = getelementptr inbounds [" + (size + 1) + " x i8], [" + (size + 1) + " x i8]* %" + id + ", i64 0, i64 0\n";
      reg++;
      block_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strps, i64 0, i64 0), i8* %" + (reg - 1) + ")\n";
      reg++;
      // %3 = getelementptr inbounds [9 x i8], [9 x i8]* %1, i64 0, i64 0
      // %4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i8* %3)
   }
   public static void printf_only_string(String id, int size) {
      block_text += "%" + reg + " = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([" + (size + 1) + " x i8], [" + (size + 1) + " x i8]* @" + id + ", i64 0, i64 0))\n";
      reg++;
   }
///////////funkcje

   public static void function_start(String id) {
      main_text += block_text;//robimy tak poniewaz teraz bedziemy dodawac tekst do definicji funkcji nie do maina
      main_reg = reg;
      header_text += "define i32 @" + id + "() nounwind {\n";
      block_text = "";
      reg = 1; // nowy reg dla funkcji
   }

   static void function_end(String string) {
      block_text += "ret i32 " + (string) + "\n";// TO DO
      //block_text += "ret i32 0\n";//chwilowy void
      block_text += "}\n";
      header_text += block_text; //dodajemy zawartosc funkcji w miejsce jej definicji
      reg = main_reg;
      block_text = ""; // wyczyść buffer
   }

   public static void call_function(String id) {
      block_text += "%" + reg + " = call i32 @" + id + "()\n";
      reg++;
   }

   ////////////////////// if
   public static void ifstart() {
      br++;
      block_text += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";// jest reg -1 bo tam odwołujemy się do równania  np. x==1
      block_text += "true"+br+":\n";
      brstack.push(br);
   }

   public static void ifend() {
      int b = brstack.pop();
      block_text += "br label %false"+b+"\n";// tu nie ma elsa wiec mozesz przejsc do falsa jagby byl else to musial bys poleciec za niego
      block_text += "false"+b+":\n";
   }
   public static void ifBlockif_and_else_start() {
      br++;
      block_text += "br i1 %"+(reg-1)+", label %true"+br+", label %else"+br+"\n";
      block_text += "true"+br+":\n";
      brstack.push(br);
   }

   public static void ifBlockif_and_else_end() {
      int b = brstack.peek();
      block_text += "br label %not_else"+b+"\n";
      block_text += "else"+b+":\n";
   }
   public static void ifexitBlock_else() {
      int b = brstack.pop();
      block_text += "br label %not_else"+b+"\n";
      block_text += "not_else"+b+":\n";
   }

   public static void icmp_int(String id, String number) {
      block_text += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = icmp eq i32 %"+(reg-1)+", "+number+"\n";
      reg++;
   }

   public static void icmp_real(String id, String number) {
      block_text += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = fcmp oeq double %"+(reg-1)+", "+number+"\n";
      reg++;


   }
   public static void icmp_ne_int(String id, String number) {
      block_text += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = icmp ne i32 %"+(reg-1)+", "+number+"\n";
      reg++;
   }

   public static void icmp_ne_real(String id, String number) {
      block_text += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = fcmp one double %"+(reg-1)+", "+number+"\n";
      reg++;


   }
   public static void icmp_gr_int(String id, String number) {
      block_text += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = icmp ugt i32 %"+(reg-1)+", "+number+"\n";
      reg++;
   }

   public static void icmp_gr_real(String id, String number) {
      block_text += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = fcmp ogt double %"+(reg-1)+", "+number+"\n";
      reg++;


   }
   public static void icmp_less_int(String id, String number) {
      block_text += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = icmp ult i32 %"+(reg-1)+", "+number+"\n";
      reg++;
   }

   public static void icmp_less_real(String id, String number) {
      block_text += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
      block_text += "%"+reg+" = fcmp olt double %"+(reg-1)+", "+number+"\n";
      reg++;


   }
   public static void repeatStart(String value) {
      declare_i32(Integer.toString(reg),false);
      int counter = reg;
      reg++;
      assign_i32("%"+Integer.toString(counter), "0");
      br++;
      block_text += "br label %cond"+br+"\n";
      block_text += "cond"+br+":\n";

      load_i32("%"+Integer.toString(counter));
      add_i32("%" + (reg - 1), "1");
      assign_i32("%" + Integer.toString(counter), "%" + (reg - 1));//i++

      block_text += "%" + reg + " = icmp slt i32 %" + (reg - 2) + ", " + value + "\n";// porówanienie zmiennej tymczasowej z iteratorem
      reg++;

      block_text += "br i1 %"+(reg-1)+", label %true"+br+", label %false"+br+"\n";
      block_text += "true"+br+":\n";
      brstack.push(br);
   }

   public static void repeatend() {
      int b = brstack.pop();
      block_text += "br label %cond" + b + "\n";
      block_text += "false" + b + ":\n";

   }



//   static void declare_i32(String id){
//      block_text += "%"+id+" = alloca i32\n";
//   }

   static void declare_i32(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global i32 0\n";
      } else {
         block_text += "%"+id+" = alloca i32\n";
      }
   }

//   static void declare_double(String id){
//      block_text += "%"+id+" = alloca double\n";
//   }

   static void declare_double(String id, Boolean global){
      if( global ){
         header_text += "@"+id+" = global double 0.0\n";
      } else {
         block_text += "%"+id+" = alloca double\n";
      }
   }

   static void assign_i32(String id, String value){
      block_text += "store i32 "+value+", i32* "+id+"\n";
   }

   static void assign_double(String id, String value){
      block_text += "store double "+value+", double* "+id+"\n";
   }

   static void declare_string(String id, int size){
      block_text += "%" + id +" = alloca ["+ (size + 1) + " x i8], align 1\n";
      block_text += "%" + reg + " = bitcast [" + (size + 1) + " x i8]* %" + id+ " to i8*\n";
      reg++;
      block_text +="call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %" + (reg - 1) + ", i8* align 1 getelementptr inbounds ([" + (size + 1) + " x i8]," +
              " [" + (size + 1) + " x i8]* @" + id + ", i32 0, i32 0), i64 " + (size + 1) + ", i1 false)\n";

      //char c[] = "abcd";

      // %1 = alloca [5 x i8], align 1
      // %2 = alloca i32, align 4????
      // %3 = bitcast [5 x i8]* %1 to i8*
      // call void @llvm.memcpy.p0i8.p0i8.i64(i8* align 1 %3, i8* align 1 getelementptr inbounds ([5 x i8],[5 x i8]* @__const.mult.c i32 0, i32 0), i64 5, i1 false)
   }

   static void load_i32(String id){
      block_text += "%"+reg+" = load i32, i32* "+id+"\n";
      reg++;
   }

   static void load_double(String id){
      block_text += "%"+reg+" = load double, double* "+id+"\n";
      reg++;
   }

   static void add_i32(String val1, String val2){
      block_text += "%"+reg+" = add i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void add_double(String val1, String val2){
      block_text += "%"+reg+" = fadd double "+val1+", "+val2+"\n";
      reg++;
   }
   static void sub_i32(String val1, String val2){
      block_text += "%"+reg+" = sub i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void sub_double(String val1, String val2){
      block_text += "%"+reg+" = fsub double "+val1+", "+val2+"\n";
      reg++;
   }


   static void mult_i32(String val1, String val2){
      block_text += "%"+reg+" = mul i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void mult_double(String val1, String val2){
      block_text += "%"+reg+" = fmul double "+val1+", "+val2+"\n";
      reg++;
   }
   static void div_i32(String val1, String val2){
      block_text += "%"+reg+" = udiv i32 "+val1+", "+val2+"\n";
      reg++;
   }

   static void div_double(String val1, String val2){
      block_text += "%"+reg+" = fdiv double "+val1+", "+val2+"\n";
      reg++;
   }

   static void sitofp(String id){
      block_text += "%"+reg+" = sitofp i32 "+id+" to double\n";
      reg++;
   }

   static void fptosi(String id){
      block_text += "%"+reg+" = fptosi double "+id+" to i32\n";
      reg++;
   }
   static void scanf_real(String id){
      block_text += "%" + reg + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strsd, i64 0, i64 0), double* " + id + ")\n";
      reg++;
   }
   static void scanf_int(String id) {
      block_text += "%" + reg + " = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i64 0, i64 0), i32* " + id + ")\n";
      reg++;
   }


   static String generate(HashMap<String, String> StringSet){
      String text = "";
      main_text += block_text;
      text += "declare i32 @printf(i8*, ...)\n";
      text += "declare i32 @__isoc99_scanf(i8*, ...)\n";
      text += "@strpi = constant [4 x i8] c\"%d\\0A\\00\"\n";
      text += "@strpd = constant [4 x i8] c\"%f\\0A\\00\"\n";
      text += "@strs = constant [3 x i8] c\"%d\\00\"\n";
      text += "@strps = private unnamed_addr constant [4 x i8] c\"%s\\0A\\00\"\n";
      text += "@strsi = constant [3 x i8] c\"%i\\00\"\n"; // scanf int
      text += "@strsd = constant [4 x i8] c\"%lf\\00\"\n"; // scanf float

      text +=Strings(StringSet);

      text += header_text;
      text += "define i32 @main() nounwind{\n";
      text += main_text;

      text += "ret i32 0 }\n";
      text += "declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg) #1\n";
      text += "declare i32 @scanf(i8*, ...) #1\n";

      return text;
   }
   static String Strings(HashMap<String, String> StringSet)
   {
      String text = "";
      for (Iterator<Map.Entry<String, String>> e = StringSet.entrySet().iterator();
           e.hasNext();) {
         Map.Entry<String, String> pair = e.next();
         String ID = pair.getKey();
         String zawartosc = pair.getValue();
         zawartosc = zawartosc.substring(1, zawartosc.length() - 1);//usuniecie "  "
         int size = zawartosc.length() + 1;
         text += "@" + ID + " = private unnamed_addr constant [" + size + " x i8] c\"" + zawartosc + "\\00\", align 1\n";
         // @__const.mult.s = private unnamed_addr constant [5 x i8] c"abcd\00", align 1
      }

      return text;
   }



}
