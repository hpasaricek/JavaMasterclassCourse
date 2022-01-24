import model.Album;
import model.Artist;
import model.DataSource;
import model.SongArtist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        if (!dataSource.open()) {
            System.out.println("Can't open DataSource");
            return;
        }

        List<Artist> artists = dataSource.queryArtists(DataSource.ORDER_BY_DESC);
        if (artists == null) {
            System.out.println("No artists.");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<Album> albums = dataSource.queryAlbumsByArtist("Iron Maiden", DataSource.ORDER_BY_ASC);
        for (Album album : albums) {
            System.out.println(album.getName());
        }

        List<String> albumsForArtist = dataSource.queryAlbumsForArtist("Carole King", DataSource.ORDER_BY_ASC);
        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        List<SongArtist> songArtists = dataSource.queryArtistsForSong("Heartless", DataSource.ORDER_BY_DESC);
        if (songArtists == null) {
            System.out.println("No songs by this name.");
        } else {
            for (SongArtist songArtist : songArtists) {
                System.out.println("Artist name = " + songArtist.getArtistName()
                        + " \nAlbum name = " + songArtist.getAlbumName() +
                        " \nTrack = " + songArtist.getTrack());
            }
        }

        dataSource.querySongsMetadata();

        int count = dataSource.getCount(dataSource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);


        dataSource.createViewForSongsArtist();

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a song title:");
        String title = scanner.nextLine();
        songArtists = dataSource.querySongInfoView(title);
        if (songArtists.isEmpty()) {
            System.out.println("Couldn't find the artist for the song.");
            return;
        }*/

        for (SongArtist artist : songArtists) {
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
        }

        dataSource.insertSong("Bird Dog", "Everly Brothers", "All-Time Greatest Hits", 7);

        dataSource.close();
    }
}
