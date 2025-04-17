
package scd.lab12.iteratorpattern;

import java.util.List;

public class ReverseIterator implements SongIterator {
    private List<Song> songs;
    private int position;

    public ReverseIterator(List<Song> songs) {
        this.songs = songs;
        this.position = songs.size() - 1;
    }

    public boolean hasNext() { return position >= 0; }

    public Song next() { return songs.get(position--); }
}
