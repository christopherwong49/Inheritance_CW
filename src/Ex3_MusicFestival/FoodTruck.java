package Ex3_MusicFestival;

import java.util.ArrayList;

public class FoodTruck extends NonMusicEvent{

    ArrayList<String> menu = new ArrayList<>();

    public FoodTruck(String n, String l, String f) {
        super(n, "food truck", l);
        menu.add(f);
    }

    public void addMenuItem (String f) {
        menu.add(f);
    }

    public void printMenu() {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }
        System.out.println();
    }
}
