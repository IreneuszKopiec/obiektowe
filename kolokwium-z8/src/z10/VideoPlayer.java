package z10;

public class VideoPlayer implements MediaPlayer{
    @Override
    public void play(String trackName) {
        System.out.println(trackName);
    }

    @Override
    public void pause() {
        System.out.println("STOP");
    }

    @Override
    public String getCurrentTrack() {
        return null;
    }
}
