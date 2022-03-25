package patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArtistFactory factory = new ArtistFactory();
        List<Artist> artists = new ArrayList<>();

        artists.add(factory.getArtistByArts(Art.EXPRESSIONISM));
        artists.add(factory.getArtistByArts(Art.EXPRESSIONISM));
        artists.add(factory.getArtistByArts(Art.EXPRESSIONISM));
        artists.add(factory.getArtistByArts(Art.EXPRESSIONISM));
        artists.add(factory.getArtistByArts(Art.MODERNISM));
        artists.add(factory.getArtistByArts(Art.MODERNISM));
        artists.add(factory.getArtistByArts(Art.MODERNISM));
        artists.add(factory.getArtistByArts(Art.MODERNISM));
        artists.add(factory.getArtistByArts(Art.MODERNISM));

        for (Artist a : artists) {
            a.draw();
        }
    }
}