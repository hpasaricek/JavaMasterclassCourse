import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return songs.addSong(title, duration);
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index < this.songs.getSongList().size()) {
            playList.add(this.songs.getSongList().get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album.");
        return false;
    }

    class SongList {
        private List<Song> songList = new ArrayList<>();

        private boolean addSong(String title, double duration) {
            if (findSong(title) == null) {
                this.songList.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song checkedSong : songList) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public List<Song> getSongList() {
            return songList;
        }

    }

}

