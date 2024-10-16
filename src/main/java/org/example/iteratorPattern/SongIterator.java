package org.example.iteratorPattern;

public class SongIterator implements Iterator {
    private SongCollection songCollection;
    private int position;

    public SongIterator(SongCollection songCollection) {
        this.songCollection = songCollection;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songCollection.getSize();
    }

    @Override
    public Song next() {
        if (this.hasNext()) {
            return songCollection.getSongAt(position++);
        }
        return null;
    }
}
