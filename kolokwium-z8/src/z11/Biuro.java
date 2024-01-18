package z11;

public class Biuro {
    private Printer print;

    public Biuro(Printer print) {
        this.print = print;
    }

    public void drukujDokument(String tekst) {
        print.drukuj(tekst);
    }
}
