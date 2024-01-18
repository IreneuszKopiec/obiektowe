package z9;

import java.util.Comparator;

public class Song implements Comparator<Song> {
    public String title;
    public String artist;
    public int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", duration=" + duration;
    }

    @Override
    public int compare(Song o1, Song o2) {
        return 0;
    }
}
