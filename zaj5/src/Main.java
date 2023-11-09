// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*

        Animal animal = new Animal("Zebra");
        Animal animal2 = new Animal("Zebra");
        System.out.println(animal == animal2);
        System.out.println(animal.equals(animal2));
        animal.makeNoise();
        Cat kot=new Cat("Filemon");
        System.out.println(kot.name);
        kot.makeNoise();
        Animal animal3 = new Cat("bonifacy");
        animal3.makeNoise();

         */



        Employee p1= new Employee();
        System.out.println(p1.displaydata());

        System.out.println();

        Book b1= new Book("ABC", "DEF",-8);
        System.out.println(b1.toString());
        Book b2=new Book("ABC","DEF",1);
        System.out.println(b2.toString());
        System.out.println(b1.equals(b2));

        System.out.println();

        Tool t1=new Hammer("Młot");
        System.out.println(t1.name);

        System.out.println();
        Pojazd pojazd = new Samochod();
        pojazd.jedz();

        System.out.println();

        Komputer k1=new Laptop();
        k1.uruchom();

        System.out.println();

        Programista programista = new Programista();

    }
}