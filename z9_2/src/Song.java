import java.util.Arrays;
import java.util.Comparator;

public class Song  implements Comparable<Song>{
    public String title;
    public String artist;
    public int duration;

    public Song(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }


    @Override
    public int compareTo(Song o) {
        if (this.duration != o.duration) {
            return Integer.compare(this.duration, o.duration);
        } else {
            return this.title.compareTo(o.title);
        }
    }
}

class SongComparator implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        if(Integer.compare(s1.duration,s2.duration)==0) {
            return s1.title.compareTo(s2.title);
        }
        return Integer.compare(s1.duration,s2.duration);
    }
}
