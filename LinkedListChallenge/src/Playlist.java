import java.util.LinkedList;

public class Playlist {
    private String name;
    private LinkedList<Song> songs = new LinkedList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void addSongToPlaylist(Album album, Song song) {
        if (album.songIsOnAlbum(song)) {
            if (songIsOnPlaylist(song)) {
                System.out.println("Song: " + song.getSongName() + " is already on playlist: " + this.name);
            } else {
                songs.add(song);
                System.out.println("Added to playlist: " + name + ", song: " + song.getSongName());
            }
        } else {
            System.out.println("Song: " + song.getSongName() + " doesn't exist on album: " + album.getAlbumName());
        }
    }

    public void listSongs() {
        int count = 1;
        System.out.println("Songs in playlist: " + name);
        for (Song song : songs) {
            System.out.println(count++ + ". " + song.getSongName());
        }
    }

    private boolean songIsOnPlaylist(Song song) {
        String newSongName = song.getSongName();
        for (Song value : songs) {
            if (value.getSongName().equals(newSongName)) {
                return true;
            }
        }
        return false;
    }

    public LinkedList<Song> getSongs() {
        return songs;
    }
}
