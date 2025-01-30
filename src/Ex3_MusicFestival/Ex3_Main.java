package Ex3_MusicFestival;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_Main {
    public static void run() {
        Scanner input = new Scanner(System.in);

        ArrayList<Event> allEvents = new ArrayList<>();

        allEvents.add(new MainStageEvent("Walk off the Earth", "music"));
        allEvents.add(new MainStageEvent("The Black Pumas", "music"));
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
        allEvents.add(new SmallStageEvent("Coldplay", "music"));
        allEvents.add(new SmallStageEvent("The Neighborhood", "music"));
        allEvents.add(new SmallStageEvent("Arctic Monkeys", "music"));


//        ((MainStageEvent)allEvents.get(0)).addTech("Pyrotechnics");
//        ((MainStageEvent)allEvents.get(0)).addTech("Symphony Orchestra");
//
//        for (int i = 0; i < allEvents.size(); i++) {
//            System.out.println(allEvents.get(i).getEventName());
//
//            if(allEvents.get(i) instanceof MainStageEvent) {
//                ((MainStageEvent) allEvents.get(i)).printTech();
//            }
//        }

        while (true) {
            System.out.println("Choose from the following options.");

            System.out.println("1. Add Event");
            System.out.println("2. Search for Event");
            System.out.println("3. Filter by Event Type");
            System.out.println("4. Group Events by Type");
            System.out.println("5. Add Main Stage Tech");
            System.out.println("6. exit.");

            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("What type of event are you adding?");
                String event = input.nextLine();

                if(event.equals("Main Stage Event")) {
                    System.out.println("What is the artist name?");
                    String artist = input.nextLine();

                    System.out.println("What type of event is this?");
                    String type = input.nextLine() ;

                    allEvents.add(new MainStageEvent(artist, type));
                }

                if(event.equals("Small Stage Event")) {
                    System.out.println("What is the artist name?");
                    String artist = input.nextLine();

                    System.out.println("What type of event is this?");
                    String type = input.nextLine() ;

                    allEvents.add(new SmallStageEvent(artist, type));
                }

                if(event.equals("Food Truck")) {
                    System.out.println("What is the truck name?");
                    String truck = input.nextLine();

                    System.out.println("Where will the truck be located?");
                    String location = input.nextLine() ;

                    System.out.println("What type of food is being sold?");
                    String food = input.nextLine() ;

                    allEvents.add(new FoodTruck(truck, location, food));
                }


            } if (choice == 2) {
                System.out.println("What event are you searching for?");
                String event = input.nextLine();

                for (int i = 0; i < allEvents.size(); i++) {
                    if(event.equals(allEvents.get(i).getEventName())){
                       allEvents.get(i).printEvent();

                        if(allEvents.get(i) instanceof MainStageEvent){
                            ((MainStageEvent) allEvents.get(i)).printTech();
                        }
                        if(allEvents.get(i) instanceof SmallStageEvent){
                            ((SmallStageEvent) allEvents.get(i)).printSongs();
                        }
                        if(allEvents.get(i) instanceof FoodTruck){
                            ((FoodTruck) allEvents.get(i)).printMenu();
                        }
                    }
                }

            } if (choice == 3) {
                System.out.println("What type of event do you want to filter by?");
                String type = input.nextLine();

                for (int i = 0; i < allEvents.size(); i++) {
                    if(type.equals(allEvents.get(i).getEventType())){
                        allEvents.get(i).printEvent();

                        if(allEvents.get(i) instanceof MainStageEvent){
                            ((MainStageEvent) allEvents.get(i)).printTech();
                        }
                        if(allEvents.get(i) instanceof SmallStageEvent){
                            ((SmallStageEvent) allEvents.get(i)).printSongs();
                        }
                        if(allEvents.get(i) instanceof FoodTruck){
                            ((FoodTruck) allEvents.get(i)).printMenu();
                        }
                    }
                }

            } if (choice == 4) {

                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i) instanceof FoodTruck){
                        allEvents.get(i).printEvent();
                        ((FoodTruck) allEvents.get(i)).printMenu();
                    }
                }

                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i) instanceof MainStageEvent){
                        allEvents.get(i).printEvent();
                        ((MainStageEvent) allEvents.get(i)).printTech();
                    }
                }

                for (int i = 0; i < allEvents.size(); i++) {
                    if(allEvents.get(i) instanceof SmallStageEvent){
                        allEvents.get(i).printEvent();
                        ((SmallStageEvent) allEvents.get(i)).printSongs();
                    }
                }
            }

            if (choice == 5) {
                System.out.println("What main stage event are you adding tech for?");
                String event = input.nextLine();
                boolean isFound = false;
                for (int i = 0; i < allEvents.size(); i++) {
                    if(event.equals(allEvents.get(i).getEventName()) && allEvents.get(i) instanceof MainStageEvent){
                        isFound = true;
                        System.out.println("What tech do you want to add?");
                        String tech = input.nextLine();
                        ((MainStageEvent) allEvents.get(i)).addTech(tech);
                    }
                }
                if(!isFound){
                    System.out.println("Event not found. Please add event first.");
                }
            }

            if(choice == 6) {
                break;
            }
        }
    }
}
