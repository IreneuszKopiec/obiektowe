import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*Koncert koncert = new Koncert();
         LotMiedzynarodowy lotMiedzynarodowy = new LotMiedzynarodowy();
         BramkaNaAutostradzie bramka = new BramkaNaAutostradzie();
         koncert.wystawBilet();
         lotMiedzynarodowy.wystawBilet();
         bramka.wystawBilet();

          */

        KierownikWycieczki kierownik =
                new KierownikWycieczki(new Koncert());
        kierownik.ogarnijBilet();
        kierownik = new KierownikWycieczki(new LotMiedzynarodowy());
        kierownik.ogarnijBilet();
        kierownik = new KierownikWycieczki(new BramkaNaAutostradzie());
        kierownik.ogarnijBilet();

        System.out.println();

        Biuro b1 = new Biuro(new StandardowyPrinter());
        b1.drukujDokument("tutaj jakis tekst");
        b1=new Biuro(new StandardowyPrinter());
        b1.drukujDokument("tutaj inny tekst");

        System.out.println();

        Samochod auto = new Samochod(new BenzynowySilnik());
        auto.start();
        auto.stop();
        auto.start();
        auto.stop();

        System.out.println();

        Uzytkownik u = new Uzytkownik(new Email());
        u.powiadomOModernizacji("Nowa informacja");

        System.out.println();

        Scanner scanner = new Scanner(System.in);
        int liczba;
        try {

            liczba=scanner.nextInt();
            System.out.println("Podaj wiek");
            Person p=new Person(liczba);

            p.checkAge(liczba);

        } catch (IllegalArgumentException e) {
            System.out.println("Wiek mniejszy od 18");
        } catch (InputMismatchException e) {
            System.out.println("To nie jest liczba");
            scanner.nextLine();
        }





        System.out.println();




        int a;
        int b;
        boolean end=false;
        while (end == false) {
            try {
                System.out.println("Podaj liczby a i b");
                a=scanner.nextInt();
                b=scanner.nextInt();
                System.out.println(a/b);
                end=true;
            } catch(InputMismatchException e) {
                System.out.println("Ponów wprowadzenie liczb");
                scanner.nextLine();
            } catch (ArithmeticException e) {
                System.out.println("Ponów wprowadzenie liczb");
            }
        }

        System.out.println();



        SprawdzaczFormatu test=new SprawdzaczFormatu();

        try {
            test.sprawdzFormatdanych("te");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println("Tekst jest za krótki");
        }





    }

}
class Person {
    int age;
    public Person(int age) {
        this.age=age;
    }

    void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Osoba iepełnoletnia");
        }
    }
}

