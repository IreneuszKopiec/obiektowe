public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Zebra", 1 , 13.);
        Animal a2 = new Animal("Zebra", 2 , 13.);

        System.out.println(Integer.toHexString(a1.hashCode()));
        System.out.println(Integer.toHexString(a2.hashCode()));

        System.out.println();

        BookDTO b1=new BookDTO("AVBC", "GDFFGD",
                45, 12);
        BookDTO b2=new BookDTO("fgsdf", "fsdfss",
                55, 12);
        BookDTO b3=new BookDTO("ghsdfghs", "gsfgs",
                31, 12);
        BookDTO b4=new BookDTO("gsdgsf", "kuyf",
                61, 12);

        System.out.println();

        Address address = new Address("Jakaś", 5,
                96500, "nie wiem");
        Person2 nowy = new Person2("Irek", "Kopiec",
                address);
        System.out.println(nowy.a().houseNumber());

        System.out.println();

        BankAccount bank= new BankAccount("543563");
        System.out.println(bank.saldo());

        System.out.println();

        MusicTrack m1=new MusicTrack("ABC", "DEF");
        System.out.println(m1.czas());

        System.out.println();

        Car c1 = new Car("fsdf", "fsdfsd",
                1432);
        c1.fuelCost(6.54, 125.5);

    }
}