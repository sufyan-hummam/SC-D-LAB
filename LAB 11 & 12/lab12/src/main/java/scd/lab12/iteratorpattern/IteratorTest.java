package scd.lab12.iteratorpattern;

public class IteratorTest {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1"));
        playlist.addSong(new Song("Song 2"));
        playlist.addSong(new Song("Song 3"));

        System.out.println("--- Forward Playlist ---");
        SongIterator forward = playlist.createForwardIterator();
        while (forward.hasNext()) {
            System.out.println(forward.next().getTitle());
        }

        System.out.println("--- Reverse Playlist ---");
        SongIterator reverse = playlist.createReverseIterator();
        while (reverse.hasNext()) {
            System.out.println(reverse.next().getTitle());
        }
    }
}
