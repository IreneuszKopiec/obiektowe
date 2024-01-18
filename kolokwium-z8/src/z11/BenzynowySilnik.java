package z11;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Benzyna go wrr");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("stop");
    }
}
