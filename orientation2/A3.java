import java.util.*;

public class main {
    public enum EventType {
        B1,
        B2,
        B3,
        B4,
        B5,
        C1,
        C2,
    }
    public static class Event {
        public int time;
        //Added Enum event type;
        public EventType type;
        public Event(int time, EventType type) {
            this.time = time;
            this.type = type;
        }
    }
    public static class EventList {
        public List<Event> eventlist = new ArrayList<>();
        public void addEvent(int time, EventType type) {
            Event newEvent = new Event(time, type);
            eventlist.add(newEvent);
        }
        int getevent = 0;
        public Event nextEvent() {
            if (getevent > eventlist.size()) {
                System.out.println("No next event, returning last event");
                return eventlist.get(eventlist.size() - 1);
            } else {
                getevent++;
                return eventlist.get(getevent);
            }
        }
        public void removeFirstEvent() {
            eventlist.remove(0);
            getevent--;
        }
        public void printEventsByTime() {
            Map<Integer, EventType> eventMap = new HashMap<>();

            for(int a = 0; a < eventlist.size(); a++) {
                eventMap.put(eventlist.get(a).time, eventlist.get(a).type);
            }
            TreeMap<Integer, EventType> sortedMap = new TreeMap<>(eventMap);
            for (Map.Entry<Integer, EventType> entry : sortedMap.entrySet()) {
                Integer key = entry.getKey();
                EventType value = entry.getValue();
                System.out.println(key + ", " + value);
            }
        }
    }
    public static void main(String[] args) {
        EventList events = new EventList();
        //Added event type in addEvent;
        events.addEvent(1, EventType.B1);
        events.addEvent(2, EventType.B2);
        events.addEvent(4, EventType.B3);
        events.addEvent(3, EventType.C1);

        events.removeFirstEvent();

        events.printEventsByTime();
    }
}