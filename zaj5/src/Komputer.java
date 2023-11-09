public class Komputer {

    public void uruchom() {
        System.out.println("Komputer uruchomiony");
    }
}

class Laptop extends Komputer{

    @Override
    public void uruchom() {
        System.out.println("Działa");
    }
}
