package Ex3_MusicFestival;

public abstract class Event {

    private static int lastEventID = 1000;
    private int eventID;
    private String eventName;
    private String eventType; //ex food, music, any type of event/venue 
    private String time;
    private String location;

    public Event(String name, String type) {
        eventID = ++lastEventID;    
        eventName = name;
        eventType = type;
        time = "tbd";
        location = "tbd";
    }

    public void printEvent() {
        System.out.println("Name: " + eventName);
        System.out.println("Event ID: "+ eventID);
        System.out.println("Event Type: " + eventType);
        System.out.println("Time: " + time);
        System.out.println("Location: " + location);
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}//end event
