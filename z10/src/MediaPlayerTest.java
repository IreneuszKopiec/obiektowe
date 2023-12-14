interface MediaPlayer{
    abstract void play(String trackName);
    abstract void pause();
    abstract String getCurrentTrack();
}
class AudioPlayer implements MediaPlayer {

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
class VideoPlayer implements MediaPlayer {

    @Override
    public void play(String trackName) {
        System.out.println(trackName);
    }

    @Override
    public void pause() {
        System.out.println("stopped");
    }

    @Override
    public String getCurrentTrack() {
        return "String";
    }
}
public class MediaPlayerTest {
    public static void main(String[] args) {
        AudioPlayer ap =new AudioPlayer();
        VideoPlayer vp = new VideoPlayer();
        ap.play("Play");
        ap.getCurrentTrack();
        ap.pause();

        vp.play("Play");
        vp.getCurrentTrack();
        vp.pause();

    }
}
