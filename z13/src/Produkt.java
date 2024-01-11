public class Produkt implements Comparable<Produkt>{
    String name;
    double price;
    int productionYear;

    public Produkt(String name, double price, int productionYear) {
        this.name=name;
        this.productionYear=productionYear;
        this.price=price;
    }

    @Override
    public String toString() {
        return "productionYear: " + productionYear;
    }

    @Override
    public int compareTo(Produkt o) {
        return Integer.compare(this.productionYear, o.productionYear);
    }
}
