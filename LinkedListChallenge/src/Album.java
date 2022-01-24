import java.util.ArrayList;

public class Album {
    private String albumName;
    private ArrayList<Song> songList = new ArrayList<>();
    private static ArrayList<Album> albums = new ArrayList<>();

    public Album(String albumName) {
        this.albumName = albumName;
        albums.add(this);
    }

    public void addSongToAlbum(Song song) {
        if (!songIsOnAlbum(song)) {
            songList.add(song);
            System.out.println("Song: " + song.getSongName() + " added to album: " + albumName);
        } else {
            System.out.println("Song: " + song.getSongName() + " already exists in album: " + albumName);
        }
    }

    public boolean songIsOnAlbum(Song song) {
        return getSongPosition(song) >= 0;
    }

    private int getSongPosition(Song song) {
        for (int i = 0; i <songList.size(); i++) {
            if (songList.get(i).getSongName().equals(song.getSongName())) {
                return i;
            }
        }
        return -1;
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }
}
