public class Kalkulator {

    public int dodaj(int a, int b) {
        return a+b;
    }
}

class KalkulatorRozszerzony extends Kalkulator{

    //@Override
    public int dodaj(int a,int b, int c) {
        return a+b+c;
    }
}
