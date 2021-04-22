import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Playlist {
    public String name;
    public ArrayList<Song> songs = new ArrayList<Song>();

    public Playlist(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return this.songs.isEmpty();
    }

    public void addSong(Song newSong) {
        this.songs.add(newSong);
        System.out.println(String.format("%s has been added to your playlist", newSong.title));
    }

    public String[] songNames() {
        String[] nameOfSongs = new String[songs.size()];

        for (int i = 0; i < nameOfSongs.length; i++) {
            nameOfSongs[i] = songs.get(i).title;
        }

        return nameOfSongs;
    }

    public int totalDuration() {
        int totalDurationOfSongs = 0;

        for (int i = 0; i < songs.size(); i++) {
            totalDurationOfSongs += songs.get(i).durationInSeconds;
        }

        return totalDurationOfSongs;
    }

    public void swap(Song firstSong, Song secondSong) {
        int firstIndex = songs.indexOf(firstSong);
        int secondIndex = songs.indexOf(secondSong);

        try {
            Collections.swap(songs, firstIndex, secondIndex);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }
}
