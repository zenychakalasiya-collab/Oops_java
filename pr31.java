import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();
        playlist.add("Song1");
        playlist.add("Song2");
        playlist.add("Song3");
        playlist.add("Song4");
        playlist.add("Song5");
        System.out.println("Playlist: " + playlist);
        String first = playlist.removeFirst();
        System.out.println("Playing: " + first);
        System.out.println("Playlist after playing first: " + playlist);
        String last = playlist.removeLast();
        System.out.println("Skipped: " + last);
        System.out.println("Playlist after skipping last: " + playlist);
    }
}
