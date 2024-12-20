package Ex3_MusicFestival;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_Main {
    public static void run() {
        Scanner input = new Scanner(System.in);

        ArrayList<Event> allEvents = new ArrayList<>();

        allEvents.add(new MainStageEvent("Walk off the Earth", "Music"));
        allEvents.add(new MainStageEvent("The Black Pumas", "Music"));
        allEvents.add(new MainStageEvent("Bruno Mars", "music"));
        allEvents.add(new MainStageEvent("Kendrick Lamar", "music"));
        allEvents.add(new MainStageEvent("Morgan Wallen", "music"));
        allEvents.add(new FoodTruck("Poutine World", "truck 1", "poutine"));
        allEvents.add(new FoodTruck("Fat Franks", "truck 2", "hot dogs"));
        allEvents.add(new FoodTruck ("Meat Street Pies", "truck 3", "pies"));
        allEvents.add(new FoodTruck("The Columbian", "truck 4", "coffee"));
        allEvents.add(new FoodTruck("Scoop N Roll", "truck 5", "ice cream"));
        allEvents.add(new SmallStageEvent("The Smiths", "music"));
        allEvents.add(new SmallStageEvent("The Killers", "music"));
        allEvents.add(new SmallStageEvent("", "music"));
        allEvents.add(new SmallStageEvent("The Neighborhood", "music"));
        allEvents.add(new SmallStageEvent("Arctic Monkeys", "music"));


        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");

        for (int i = 0; i < allEvents.size(); i++) {
            System.out.println(allEvents.get(i).getEventName());

            if(allEvents.get(i) instanceof MainStageEvent) {
                ((MainStageEvent) allEvents.get(i)).printTech();
            }
        }

        while (true) {
            System.out.println("Choose from the following options.");

            System.out.println("1. Choice 1");
            System.out.println("2. Choice 2");
            System.out.println("3. Choice 3");
            System.out.println("4. exit.");

            int choice = Library.input.nextInt();
            Library.input.nextLine();

            if (choice == 1) {
                System.out.println("Choice 1");
            } else if (choice == 2) {

            } else if (choice == 3) {

            } else if (choice == 4) {
                break;
            }

        } // while loop
    }
}
