import java.util.Comparator;

public class Samochod implements Comparable {
    String marka;
    int przebieg;
    int rokProdukcji;

    @Override
    public String toString() {
        return "Samochod{" +
                "przebieg=" + przebieg +
                '}';
    }

    public Samochod(int przebieg) {
        this.przebieg=przebieg;
    }


    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
class test implements Comparator<Samochod> {


    @Override
    public int compare(Samochod o1, Samochod o2) {
        return Integer.compare(o1.przebieg,o2.przebieg);
    }
}
