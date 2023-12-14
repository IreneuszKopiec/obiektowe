interface MusicPlayer {
    abstract void turnOff();
    abstract void turnOn();
    abstract void nextTrack();
}
public class Radio implements MusicPlayer {

    @Override
    public void turnOff() {
        System.out.println("Radio wyłączone");
    }

    @Override
    public void turnOn() {
        System.out.println("Radio włączone");
    }

    @Override
    public void nextTrack() {
        System.out.println("Zmieniono stację radiową");
    }
}
