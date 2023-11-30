public record MusicTrack(String title, String author,
                         int czas) {
    public MusicTrack(String title, String author) {
        this(title,author, 180);
    }
}
