
package scd.lab12.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) { songs.add(song); }
    public SongIterator createForwardIterator() {
        return new ForwardIterator(songs);
    }
    public SongIterator createReverseIterator() {
        return new ReverseIterator(songs);
    }
}
