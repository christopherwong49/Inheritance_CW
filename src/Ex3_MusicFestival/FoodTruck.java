package Ex3_MusicFestival;

public class FoodTruck extends NonMusicEvent{

    private String food;

    public FoodTruck(String n, String l, String f) {
        super(n, "food truck", l);
        food = f;
    }
}
