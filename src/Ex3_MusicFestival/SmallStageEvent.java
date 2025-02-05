package Ex3_MusicFestival;

import java.util.ArrayList;

public class SmallStageEvent extends Event{
    ArrayList<String> allSongs = new ArrayList<>();

    public SmallStageEvent(String name, String type) {
        super(name, type);
    }

    public void addSong(String s) {
        allSongs.add(s);
    }

    public void printSongs() {
        for (int i = 0; i < allSongs.size(); i++) {
            System.out.println(allSongs.get(i));
        }
        System.out.println();
    }

}