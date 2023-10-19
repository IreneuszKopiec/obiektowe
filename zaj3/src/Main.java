public class Main {
    public static void main(String[] args) {
        House domStefana = new House();
        domStefana.garage = true;
        domStefana.rooms = 6;
        domStefana.area = 150;
        domStefana.floors = 2;
        domStefana.garden = false;

        //System.out.println(domStefana.getValue());

        House domSylwii = new House();
        domSylwii.garage = false;
        domSylwii.rooms = 4;
        domSylwii.area = 175;
        domSylwii.floors = 2;
        domSylwii.garden = true;

        //System.out.println(domSylwii.getValue());

        Dog pies = new Dog();
        pies.breed="owczarek";
        pies.name="Alex";
        pies.age=2;

        //pies.bark();

        Car auto = new Car();
        auto.speed=120;
        auto.brand="BMW";
        auto.model="jakis tam";

        //System.out.println(auto.speed);
        auto.accelerate(50);
        auto.decelerate(20);
        //System.out.println(auto.speed);

        Time czas= new Time();
        czas.minutes=45;
        czas.hours=11;
        Time nowy =czas.addTime(czas);
        //System.out.println(nowy.hours);
        //System.out.println(nowy.minutes);
        Time nowy2=nowy.addTime(nowy);
        //System.out.println(nowy2.hours);
        //System.out.println(nowy2.minutes);
        Time nowy3=czas.addTime(czas);
        //System.out.println(nowy3.hours);
        //System.out.println(nowy3.minutes);

        Car2 auto2 = null;
        if(auto2==null) {
            //System.out.println("Nie ma auta");
        }

        Dog pies2 = null;
        //pies2.bark();

        Czlowiek osoba1 = new Czlowiek();
        osoba1.imie="Irek";
        //osoba1.przedstawSie();
        Czlowiek osoba2 = new Czlowiek();
        osoba2.imie="Jacek";
        //osoba1.powiedzCzesc(osoba2);
        osoba1.zmienImie("Bartek");
        //osoba1.przedstawSie();



        Czlowiek osoba3= new Czlowiek();
        osoba3.imie="Jan";
        Czlowiek osoba4= new Czlowiek();
        osoba4.imie="Marcin";
        osoba3.zamienImionami(osoba4);
        osoba3.przedstawSie();
        osoba4.przedstawSie();





        System.out.println(" ");

        Licznik l = new Licznik();
        l.liczba=100;
        l.zwieksz(50);
        System.out.println(l.liczba);
        Licznik l2 = new Licznik();
        l2.liczba=200;
        l.dodaj(l2);
        System.out.println(l.liczba);
        System.out.println(l2.liczba);
        int a=3;
        Zmieniacz zm = new Zmieniacz();
        zm.zmienWartosc(a);
        System.out.println(a);
        zm.zmienObiekt(l);
        System.out.println(l.liczba);

        System.out.println(" ");

        Osoba os = new Osoba();
        os.imie="Irek";
        //os.haslo="hej";
        System.out.println(os.imie);

        System.out.println(" ");

        //auto.blowEngine();

        System.out.println(" ");



    }
}

