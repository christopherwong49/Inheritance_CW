package Ex3_MusicFestival;

import java.util.ArrayList;

public class Ex3_Main {
    public static void run() {
        ArrayList<Event> allEvents = new ArrayList<>();

        allEvents.add(new MainStageEvent("Walk off the Earth", "Music"));
        allEvents.add(new MainStageEvent("The Black Pumas", "Music"));
        allEvents.add(new MainStageEvent());
        allEvents.add(new MainStageEvent());
        allEvents.add(new MainStageEvent());
        allEvents.add(new NonMusicEvent("Curry Connection", "Food Truck", "Truck 9"));
        allEvents.add(new NonMusicEvent());
        allEvents.add(new NonMusicEvent());
        allEvents.add(new NonMusicEvent());
        allEvents.add(new NonMusicEvent());
        allEvents.add(new SmallStageEvent());
        allEvents.add(new SmallStageEvent());
        allEvents.add(new SmallStageEvent());
        allEvents.add(new SmallStageEvent());
        allEvents.add(new SmallStageEvent());


        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");

        for (int i = 0; i < allEvents.size(); i++) {
            System.out.println(allEvents.get(i).getEventName());

            if(allEvents.get(i) instanceof MainStageEvent) {
                ((MainStageEvent) allEvents.get(i)).printTech();
            }
        }
    }
}
