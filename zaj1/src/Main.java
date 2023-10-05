import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Podaj pierwszą liczbę:");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę:");
        double liczba2 = scanner.nextDouble();
        System.out.println("Wynik dodawania to: "+(liczba1+liczba2));
        System.out.println("Wynik odejmowania to: "+(liczba1-liczba2));
        System.out.println("Wynik mnozenia to: "+(liczba1*liczba2));
        System.out.println("Wynik dzielenia to: "+(liczba1/liczba2));

        System.out.println("Podaj pierwszy tekst:");
        String strl = scanner.next();
        System.out.println("Podaj drugi tekst:");
        String strl2 = scanner.next();
        System.out.println(strl);
        System.out.println(strl2);

        System.out.println("Podaj pierwszą liczbę wymierna:");
        double w1 = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę wymierna:");
        double w2 = scanner.nextDouble();
        System.out.println("Podaj trzecią liczbę wymierna:");
        double w3 = scanner.nextDouble();
        System.out.println("Podaj czwartą liczbę wymierna:");
        double w4 = scanner.nextDouble();
        System.out.println("Suma = "+(w1+w2+w3+w4));

        System.out.println("Podaj dlugosc boku kwadratu:");
        double bok = scanner.nextDouble();

        System.out.println("Pole kwadratu  wynosi "+(Math.pow(bok,2)));
        */

        /*
        System.out.println("Podaj pierwszą liczbę calkowita:");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę calkowita:");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę calkowita:");
        int c = scanner.nextInt();
        if(a>b && a>c) {
            System.out.println("Największą liczbą jest "+a);
        } else if (b>a && b>c) {
            System.out.println("Największą liczbą jest "+b);
        }
        else {
            System.out.println("Największą liczbą jest "+c);
        }

        System.out.println("Podaj numer tygodnia: ");
        int numerdnia = scanner.nextInt();
        switch (numerdnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            case 4:
                System.out.println("Czwartek");
                break;
            case 5:
                System.out.println("Piątek");
                break;
            case 6:
                System.out.println("Sobota");
                break;
            case 7:
                System.out.println("Niedziela");
                break;
            default:
                System.out.println("Zły numer tygodnia");
        }

        System.out.println("podaj rok: ");
        int rok = scanner.nextInt();
        if(rok%4==0) {
            if(rok%100==0&&rok%400!=0) {
                System.out.println("Rok nie jest przestępny");
            } else {
                System.out.println("Rok jest przestępny");
            }
        } else {
            System.out.println("Rok nie jest przestępny");
        }

        System.out.println("podaj godzine: ");
        int g = scanner.nextInt();
        System.out.println("podaj minuty: ");
        int m = scanner.nextInt();
        System.out.println("podaj sekundy: ");
        int s = scanner.nextInt();
        if(g>=0&&g<=24&&m>=0&&m<=59&&s>=0&&s<=59) {
            System.out.println("Poprawna godzina");
        } else {
            System.out.println("Niepoprawna godzina");
        }

         */

        /*
        for(int i=0;i<=100;i++) {
            System.out.println(i);
        }

        int suma=0;
        for(int i=1;i<=50;i++) {
            suma+=i;
        }
        System.out.println("Suma liczb od 1 do 50: "+suma);

        System.out.println("podaj liczbe: ");
        int liczba = scanner.nextInt();
        int suma3=0;
        do {
            suma3+=liczba%10;
            liczba=liczba/10;
        } while(liczba>0);
        System.out.println("Suma wynosi: "+suma3);

        System.out.println("podaj liczbe: ");
        int liczba4 = scanner.nextInt();
        int nowa=0, k=0, help=liczba4;
        do {
            k++;
            help=help/10;
        } while(help>0);
        k--;
        do {
            nowa+=liczba4%10*Math.pow(10,k);
            liczba4=liczba4/10;
            k--;
        } while(liczba4>0);
        System.out.println("Odwrotna kolejnosc: "+nowa);

         */

        System.out.println("podaj liczbe: ");
        int liczba = scanner.nextInt();
        int k=0, help=liczba;
        while(help>0) {
            k++;
            help=help/10;
        }
        int wynik = 0;
        help=liczba;
        while(help>0) {
            wynik+=Math.pow(help%10, k);
            help/=10;
        }
        if(wynik==liczba) {
            System.out.println("Jest to liczba Armstronga");
        } else {
            System.out.println("Nie jest to liczba Armstronga");
        }

        int liczba2, suma=0;
        while(suma<100) {
            System.out.println("podaj liczbe: ");
            liczba2=scanner.nextInt();
            suma+=liczba2;
        }
    }
}