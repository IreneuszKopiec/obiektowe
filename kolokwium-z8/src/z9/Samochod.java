package z9;

public class Samochod implements Comparable<Samochod>{
    private String marka;
    private int przebieg;
    private int rokProdukcji;

    public Samochod(int przebieg) {
        this.przebieg = przebieg;
    }

    @Override
    public String toString() {
        return "przebieg=" + przebieg;

    }

    @Override
    public int compareTo(Samochod o) {
        return Integer.compare(this.przebieg, o.przebieg);
    }
}
