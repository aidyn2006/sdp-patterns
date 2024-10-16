package org.example.iteratorPattern;

public class Main {
    public static void main(String[] args) {
        SongCollection songCollection = new SongCollection();

        songCollection.addSong(new Song("Bohemian Rhapsody", "Queen"));
        songCollection.addSong(new Song("Imagine", "John Lennon"));
        songCollection.addSong(new Song("Hotel California", "Eagles"));

        Iterator songIterator = songCollection.createIterator();

        while (songIterator.hasNext()) {
            Song song = songIterator.next();
            System.out.println(song);
        }
    }
}
