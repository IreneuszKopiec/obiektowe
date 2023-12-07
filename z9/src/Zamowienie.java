import java.util.Comparator;

public class Zamowienie implements Comparable<Zamowienie> {
    String nazwaProduktu;
    int ilosc;
    double cenaJednostkowa;

    public Zamowienie() {

    }

    @Override
    public int compareTo(Zamowienie o) {
        if(Double.compare(o.cenaJednostkowa,this.cenaJednostkowa)==0) {
            return Double.compare(o.ilosc,this.ilosc);
        }
        return Double.compare(o.cenaJednostkowa,this.cenaJednostkowa);
    }
}

