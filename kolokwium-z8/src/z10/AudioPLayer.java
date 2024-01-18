package z10;

public class AudioPLayer implements MediaPlayer{
    @Override
    public void play(String trackName) {
        System.out.println(trackName);
    }

    @Override
    public void pause() {
        System.out.println("stop");
    }

    @Override
    public String getCurrentTrack() {
        return "balladyna";
    }
    public static void main(String[] args) {
        AudioPLayer audio = new AudioPLayer();
        VideoPlayer video = new VideoPlayer();
        audio.play("HEJ");
        audio.getCurrentTrack();
        audio.pause();

        video.play("HEJ");
        video.getCurrentTrack();
        video.pause();

    }
}
