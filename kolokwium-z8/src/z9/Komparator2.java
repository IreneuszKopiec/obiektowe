package z9;

import java.util.Comparator;

public class Komparator2 implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        if(Integer.compare(s1.duration,s2.duration)==0) {
            return s1.title.compareTo(s2.title);
        }
        return Integer.compare(s1.duration,s2.duration);
    }
}
