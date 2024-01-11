import jeden.NiepoprawnyFormatDanychExeption;
import powiadomienie.Discord;
import powiadomienie.Email;
import powiadomienie.Uzytkownik;

import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        /*
        public static void sprawdzFormatDanych (String dane) throws NiepoprawnyFormatDanychExeption
        {
            if(dane.isEmpty()) {
                throw new NiepoprawnyFormatDanychExeption("Pusty");
            }
        }
        */


        /*
        Scanner scanner = new Scanner(System.in);
        int a, b;
        while(true) {
            try {
                System.out.println("Podaj 1 liczbe");
                a=scanner.nextInt();
                System.out.println("Podaj 2 liczbę");
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
        */

        /*

        ArrayList<Produkt> list = new ArrayList<>();
        list.add(new Produkt("item1", 3.5, 2002));
        list.add(new Produkt("item2", 5.5, 2001));
        list.add(new Produkt("item3", 4.5, 1999));
        list.add(new Produkt("item4", 5.5, 2020));
        list.add(new Produkt("item5", 9.5, 2002));
        Collections.sort(list);
        System.out.println(list);

         */

        /*
        Person[] people = {
                new Person("Jan", "kowalski", 1979),
                new Person("Piotr", "zyk", 1999),
                new Person("Kamil", "kowalski", 2001)
        };
        Arrays.sort(people, new BirthYear());

        for(var o: people) {
            System.out.println(o);
        }

        System.out.println();
        Arrays.sort(people, new LastNameComparator());

        for(var o: people) {
            System.out.println(o);
        }

         */


        Uzytkownik user = new Uzytkownik(new Discord());
        Uzytkownik user2 = new Uzytkownik(new Email());
        user.powiadomienieOModernizacji("informacja");
        user2.powiadomienieOModernizacji("wiadomosc");


    }
}