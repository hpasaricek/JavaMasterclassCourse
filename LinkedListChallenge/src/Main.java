import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Album album1 = new Album("Sign of the Times");
        Song song1 = new Song("London Rain", "3:30");
        Song song2 = new Song("Trip to PD", "4:30");
        Song song3 = new Song("Flatline", "5:00");

        Album album2 = new Album("Best Hits");
        Song song4 = new Song("Motorcycle", "3:45");
        Song song5 = new Song("Under Your Spell", "6:00");

        album1.addSongToAlbum(song1);
        album1.addSongToAlbum(song2);
        album1.addSongToAlbum(song3);
        album2.addSongToAlbum(song4);
        album2.addSongToAlbum(song5);
        album2.addSongToAlbum(song5);

        System.out.println("==========================");
        Playlist playlist1 = new Playlist("Cosmic Gate HITS");
        playlist1.addSongToPlaylist(album1, song1);
        playlist1.addSongToPlaylist(album1, song2);
        playlist1.addSongToPlaylist(album1, song3);
        playlist1.addSongToPlaylist(album2, song4);
        playlist1.addSongToPlaylist(album2, song5);

        playPlaylist(playlist1);


    }

    private static void displayMenu() {
        System.out.println("Choose the option:");
        System.out.println("1. Next song\n" +
                "2. Previous song\n" +
                "3. Replay song\n" +
                "4. Remove current song from playlist\n" +
                "5. List songs in playlist\n" +
                "6. Quit");
    }

    private static void playPlaylist(Playlist playlist) {
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> songNameIterator = playlist.getSongs().listIterator();
        displayMenu();

        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if (!goingForward) {
                        if (songNameIterator.hasNext()) {
                            songNameIterator.next();
                            goingForward = true;
                        }
                    }

                    if (songNameIterator.hasNext()) {
                        System.out.println("Currently playing: " + songNameIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (songNameIterator.hasPrevious()) {
                            songNameIterator.previous();
                            goingForward = false;
                        }
                    }

                    if (songNameIterator.hasPrevious()) {
                        System.out.println("Currently playing: " + songNameIterator.previous().toString());
                    } else {
                        System.out.println("Reached the beginning of the playlist.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if (goingForward) {
                        if (songNameIterator.hasNext()) {
                            System.out.println("Replaying song: " + songNameIterator.previous().toString());
                            songNameIterator.next();
                        } else {
                            System.out.println("You have reached the end of the list.");
                        }
                    } else {
                        if (songNameIterator.hasPrevious()) {
                            songNameIterator.previous();
                            System.out.println("Replaying song: " + songNameIterator.next().toString());
                        } else {
                            System.out.println("You have reached the start of the list.");
                        }
                    }
                    break;
                case 4:
                    songNameIterator.remove();
                    break;
                case 5:
                    playlist.listSongs();
                    break;
                case 6:
                    System.out.println("Quitting program.");
                    quit = true;
                    break;
            }
        }
    }
}
