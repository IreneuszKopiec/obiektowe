import z11.*;
import z11.Samochod;
import z8.*;
import z9.*;
import z10.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*   zajecia nr 8 - rekordy
        BookDTO b1=new BookDTO("AVBC", "GDFFGD",
                45, 12);
        BookDTO b2=new BookDTO("fgsdf", "fsdfss",
                55, 12);
        BookDTO b3=new BookDTO("ghsdfghs", "gsfgs",
                31, 12);
        BookDTO b4=new BookDTO("gsdgsf", "kuyf",
                61, 12);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println();

        Address address = new Address("Jakaś", 5,
                "96500", "nie wiem");
        Person nowy = new Person("Irek", "Kopiec",
                address);
        System.out.println(nowy.a().houseNumber());

        System.out.println();

        BankAccount bank = new BankAccount("123");
        BankAccount bank2 = new BankAccount("123", 123);
        System.out.println(bank);
        System.out.println(bank2);

        System.out.println();

        MusicTrack m1=new MusicTrack("Jakis","Jan betoven");
        System.out.println(m1.time());

        System.out.println();

        Car c = new Car("ABC","model",
                5.6);
        System.out.println(c.fuelCost(175, 200));

        System.out.println();

         */

        // Zajecia nr 9 - Comparable, Comparator, Clonable
        /*

        ArrayList<Ksiazka> k = new ArrayList<>();
        k.add(new Ksiazka(123));
        k.add(new Ksiazka(2432));
        k.add(new Ksiazka(423));
        k.add(new Ksiazka(86));
        Collections.sort(k);
        System.out.println(k);

        System.out.println();

        ArrayList<Samochod> s = new ArrayList<>();
        s.add(new Samochod(123));
        s.add(new Samochod(2432));
        s.add(new Samochod(423));
        s.add(new Samochod(86));
        Collections.sort(s);
        System.out.println(s);

        System.out.println();

        ArrayList<Zamowienie> z = new ArrayList<>();
        z.add(new Zamowienie(12, 5.5));
        z.add(new Zamowienie(3, 6.5));
        z.add(new Zamowienie(17, 5.5));
        z.add(new Zamowienie(12, 9.5));
        Collections.sort(z);
        System.out.println(z);

        System.out.println();

        ArrayList<Order> o =new ArrayList<>();
        o.add(new Order(1, LocalDate.now()));
        o.add(new Order(2, LocalDate.now()));
        o.add(new Order(4, LocalDate.now()));
        o.add(new Order(2, LocalDate.now()));
        Collections.sort(o, new Komparator());
        System.out.println(o);

        System.out.println();

        ArrayList<Song> song =new ArrayList<>();
        song.add(new Song("Hej", 123));
        song.add(new Song("Hej", 324));
        song.add(new Song("Hej", 523));
        song.add(new Song("Haj", 123));
        Collections.sort(song, new Komparator2());
        System.out.println(song);

         */

        // z10 - interfejsy

        /*
        Radio radio = new Radio();
        radio.turnOn();
        radio.nextTrack();
        radio.turnOff();

        System.out.println();


         */

        //z11 -delegacje + walidacja
        /*

        Biuro biuro = new Biuro(new StandardowyPrinter());
        biuro.drukujDokument("Tekst do wydrukowania");
        biuro.drukujDokument("Inny tekst");

        System.out.println();

        Samochod car = new Samochod(new BenzynowySilnik());
        car.start();
        car.stop();

        System.out.println();

        Uzytkownik user = new Uzytkownik(new Email());
        user.powiadomienieOModernizacji("Powiadom mnie");

        System.out.println();


        Scanner scanner = new Scanner(System.in);
        int liczba;
        try {

            System.out.println("Podaj wiek");
            liczba=scanner.nextInt();



            checkAge(liczba);

        } catch (IllegalArgumentException e) {
            System.out.println("Wiek mniejszy od 18");
        } catch (InputMismatchException e) {
            System.out.println("To nie jest liczba");
            scanner.nextLine();
        }

        int a, b;
        while(true) {
            try {
                System.out.println("Podaj 1 liczbe");
                a=scanner.nextInt();
                System.out.println("Podaj 2 liczbe");
                b=scanner.nextInt();

                System.out.println(a/b);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Nie dziel przez 0");
            } catch (InputMismatchException e) {
                System.out.println("Nie podano liczb");
                scanner.nextLine();
            }
        }

        SprawdzaczFormatu test=new SprawdzaczFormatu();

        try {
            test.sprawdzFormatDanych("te");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println("Tekst jest za krótki");
        }

         */

        //z12 - generyczne - doTestowania



        }





    public static void checkAge(int age) {
        if(age<18) {
            throw new IllegalArgumentException("Osoba niepełnoletnia");
        }
    }


}