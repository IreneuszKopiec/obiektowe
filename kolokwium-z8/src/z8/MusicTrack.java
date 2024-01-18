package z8;

public record MusicTrack(String title, String author, int time) {

    public MusicTrack(String title, String author) {
        this(title, author, 180);
    }
}
