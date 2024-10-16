package org.example.iteratorPattern;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

}
