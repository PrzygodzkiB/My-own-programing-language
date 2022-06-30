
print "Wpisz iterator calkowity "
int iterator
read iterator

int x = 0

#real w=1.0
# funkcja fibonacciego
def fibonacci{
int wynik
int y = 1
if (iterator ==0){
    wynik =0
}else{
    if (iterator ==1){
        wynik =1
    }else{
        if (iterator ==2){
                wynik =1
        }else{
            iterator=iterator - 1
            loop iterator{
            wynik = x + y
            x = y
            y = wynik
            }
            }
    }
}

return wynik
}

int wynik = fibonacci()

print "Wartosc ciagu Fibonacciego o wpisanym wyrazie wynosi   "
print wynik

