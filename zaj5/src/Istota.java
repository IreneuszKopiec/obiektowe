public class Istota {
    public Istota() {
        System.out.println("3");
    }
}

class Czlowiek extends Istota{
    public Czlowiek() {
        System.out.println("2");
    }
}

class Programista extends Czlowiek{
    public Programista() {
        System.out.println("1");
    }
}