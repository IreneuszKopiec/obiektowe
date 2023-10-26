public class Osoba {
    public String imie;
    public String nazwisko;
    public int wiek;
    public static int licznik;

    public Osoba(String imie, String nazwikso, int wiek) {
        this.imie=imie;
        this.nazwisko=nazwikso;
        this.wiek=wiek;
    }

    public Osoba(String imie, String nazwisko) {
        this(imie, nazwisko, 0);
    }

    public Osoba() {
        this("Default");
    }

    public Osoba(String imie) {
        this.imie=imie;
        licznik++;
    }

    public static void getLicznik() {
        System.out.println(licznik);
    }
}
