package org.example.iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class SongCollection {
    private List<Song> songs;

    public SongCollection() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public Song getSongAt(int index) {
        return songs.get(index);
    }

    public int getSize() {
        return songs.size();
    }

    public Iterator createIterator() {
        return new SongIterator(this);
    }
}
