
package scd.lab12.iteratorpattern;

import java.util.List;

public class ForwardIterator implements SongIterator {
    private List<Song> songs;
    private int position = 0;

    public ForwardIterator(List<Song> songs) {
        this.songs = songs;
    }

    public boolean hasNext() { return position < songs.size(); }

    public Song next() { return songs.get(position++); }
}
