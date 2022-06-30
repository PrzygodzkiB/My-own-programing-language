declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strpi = constant [4 x i8] c"%d\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strs = constant [3 x i8] c"%d\00"
@strps = private unnamed_addr constant [4 x i8] c"%s\0A\00"
@strsi = constant [3 x i8] c"%i\00"
@strsd = constant [4 x i8] c"%lf\00"
@unknow_2 = private unnamed_addr constant [56 x i8] c"Wartosc ciagu Fibonacciego o wpisanym wyrazie wynosi   \00", align 1
@unknow_1 = private unnamed_addr constant [26 x i8] c"Wpisz iterator calkowity \00", align 1
@iterator = global i32 0
@x = global i32 0
define i32 @fibonacci() nounwind {
%wynik = alloca i32
store i32 0, i32* %wynik
%y = alloca i32
store i32 0, i32* %y
store i32 1, i32* %y
%1 = load i32, i32* @iterator
%2 = icmp eq i32 %1, 0
br i1 %2, label %true1, label %else1
true1:
store i32 0, i32* %wynik
br label %not_else1
else1:
%3 = load i32, i32* @iterator
%4 = icmp eq i32 %3, 1
br i1 %4, label %true2, label %else2
true2:
store i32 1, i32* %wynik
br label %not_else2
else2:
%5 = load i32, i32* @iterator
%6 = icmp eq i32 %5, 2
br i1 %6, label %true3, label %else3
true3:
store i32 1, i32* %wynik
br label %not_else3
else3:
%7 = load i32, i32* @iterator
%8 = sub i32 %7, 1
store i32 %8, i32* @iterator
%9 = load i32, i32* @iterator
%10 = alloca i32
store i32 0, i32* %10
br label %cond4
cond4:
%11 = load i32, i32* %10
%12 = add i32 %11, 1
store i32 %12, i32* %10
%13 = icmp slt i32 %11, %9
br i1 %13, label %true4, label %false4
true4:
%14 = load i32, i32* @x
%15 = load i32, i32* %y
%16 = add i32 %15, %14
store i32 %16, i32* %wynik
%17 = load i32, i32* %y
store i32 %17, i32* @x
%18 = load i32, i32* %wynik
store i32 %18, i32* %y
br label %cond4
false4:
br label %not_else3
not_else3:
br label %not_else2
not_else2:
br label %not_else1
not_else1:
%19 = load i32, i32* %wynik
ret i32 %19
}
@wynik = global i32 0
define i32 @main() nounwind{
%1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([26 x i8], [26 x i8]* @unknow_1, i64 0, i64 0))
store i32 0, i32* @iterator
%2 = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strsi, i64 0, i64 0), i32* @iterator)
store i32 0, i32* @x
store i32 0, i32* @x
store i32 0, i32* @wynik
%3 = call i32 @fibonacci()
store i32 %3, i32* @wynik
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([56 x i8], [56 x i8]* @unknow_2, i64 0, i64 0))
%5 = load i32, i32* @wynik
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %5)
ret i32 0 }
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg) #1
declare i32 @scanf(i8*, ...) #1

