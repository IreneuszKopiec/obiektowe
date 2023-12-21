public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("start");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("stop");
    }
}
