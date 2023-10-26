// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Ksiazka k1 = new Ksiazka();
        System.out.println(k1.rokWydania);
        Ksiazka k2= new Ksiazka("Ostatnie życzenie",
                "Andrzej Sapkowski", 1993);
        System.out.println(k2.autor);
         */

        Osoba o1=new Osoba("irek", "kopiec", 21);
        Osoba o2=new Osoba("Patryk", "Nowak");
        System.out.println(o2.imie);

        System.out.println("");

        Kwadrat k1=new Kwadrat(7);
        System.out.println(k1.bok);
        Kwadrat k2=new Kwadrat();
        System.out.println(k2.bok);

        System.out.println("");

        Student s1=new Student("irek","kopiec",
                "informatyka");
        System.out.println(s1.kierunekStudiow);
        Student s2=new Student("Patryk", "Nowak");
        System.out.println(s2.kierunekStudiow);

        System.out.println("");

        Osoba o3=new Osoba();
        Osoba o4=new Osoba();
        Osoba.getLicznik();

        System.out.println("");

        Matematyka m1=new Matematyka();
        //m1.PI=12;
        System.out.println(m1.PI);

        System.out.println("");

        Kalkulator2.wyniki();

        System.out.println("");

        Produkt p1=new Produkt();
        Produkt p2=new Produkt();
        Produkt p3=new Produkt();
        Produkt p4=new Produkt();
        Produkt p5=new Produkt();
        Produkt p6=new Produkt();
        System.out.println(Produkt.liczbaProduktow);

        System.out.println("");


    }
}