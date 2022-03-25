package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArtistFactory {

    private static final Map<Art, Artist> artists = new HashMap<>();

    public Artist getArtistByArts(Art art) {
        Artist artist = artists.get(art);

        if (Objects.isNull(artist)) {
            switch (art) {
                case EXPRESSIONISM -> {
                    artist = new Impressionist();
                    System.out.println("Looking for a impressionist");
                }
                case MODERNISM -> {
                    artist = new Modernist();
                    System.out.println("Looking for a modernist");
                }
            }
            artists.put(art, artist);
        }
        return artist;
    }
}
