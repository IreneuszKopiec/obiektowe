package z9;

import java.time.LocalDate;

public class Ksiazka implements Comparable<Ksiazka>{
    private String tytul;
    private int liczbaStron;
    private LocalDate dataWydania;

    @Override
    public String toString() {
        return ", liczbaStron=" + liczbaStron;
    }

    public Ksiazka(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }

    @Override
    public int compareTo(Ksiazka o) {
        return Integer.compare(o.liczbaStron, this.liczbaStron);
    }
}
