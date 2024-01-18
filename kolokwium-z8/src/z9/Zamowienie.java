package z9;

public class Zamowienie implements Comparable<Zamowienie> {
    private String nazwaProduktu;
    private int ilosc;
    private double cenaJednostkowa;

    public Zamowienie(int ilosc, double cenaJednostkowa) {
        this.ilosc = ilosc;
        this.cenaJednostkowa = cenaJednostkowa;
    }

    @Override
    public String toString() {
        return "ilosc=" + ilosc +
                ", cenaJednostkowa=" + cenaJednostkowa;

    }

    @Override
    public int compareTo(Zamowienie o) {
        if(Double.compare(o.cenaJednostkowa,this.cenaJednostkowa)==0) {
            return Integer.compare(this.ilosc,o.ilosc);
        }
        return Double.compare(o.cenaJednostkowa,this.cenaJednostkowa);
    }
}
