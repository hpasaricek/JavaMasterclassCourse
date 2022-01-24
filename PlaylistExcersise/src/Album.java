import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) != null) {
            return false;
        }

        songs.add(new Song(songTitle, duration));
        return true;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber >= songs.size()) {
            return false;
        }

        playlist.add(songs.get(trackNumber));
        return true;
    }

    public boolean addToPlaylist(String songTitle, LinkedList<Song> playlist) {
        if (findSong(songTitle) == null) {
            return false;
        }

        playlist.add(findSong(songTitle));
        return true;
    }

    private Song findSong(String songTitle) {
        Song currentSong = null;

        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                currentSong = song;
            }
        }

        return currentSong;
    }
}
