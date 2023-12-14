import java.util.Comparator;

public class Zamowienie implements Comparable<Zamowienie> {
    String nazwaProduktu;
    int ilosc;
    double cenaJednostkowa;

    public Zamowienie(double cenaJednostkowa, int ilosc) {
        this.cenaJednostkowa=cenaJednostkowa;
        this.ilosc=ilosc;
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                ", ilosc=" + ilosc +
                ", cenaJednostkowa=" + cenaJednostkowa +
                '}';
    }

    @Override
    public int compareTo(Zamowienie o) {
        if(Double.compare(o.cenaJednostkowa,this.cenaJednostkowa)==0) {
            return Double.compare(this.ilosc,o.ilosc);
        }
        return Double.compare(o.cenaJednostkowa,this.cenaJednostkowa);
    }
}

