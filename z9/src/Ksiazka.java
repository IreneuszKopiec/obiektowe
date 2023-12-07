import java.time.LocalDate;
import java.util.Comparator;

public class Ksiazka implements Comparable  {
    String tytul;
    int liczbaStron;
    LocalDate dataWydania;

    public Ksiazka(int liczbaStron) {

        this.liczbaStron=liczbaStron;
    }

    @Override
    public String toString() {
        return "Strony "+liczbaStron;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
class test2 implements Comparator<Ksiazka>{



    @Override
    public int compare(Ksiazka o1, Ksiazka o2) {
        return Integer.compare(o1.liczbaStron,o2.liczbaStron);
    }
}
