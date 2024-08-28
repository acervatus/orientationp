import java.util.*;
public class Main {
	public class Event {
		public int time;
	}
	public static class EventList {
		public List<Event> eventlist = new List<Event>();
		public void AddEvent(int time) {
			newEvent = new Event();
			newEvent.time = time;
			eventlist.add(newEvent);
		}
		int getevent = 0;
		public void NextEvent() {
			if(getevent + 1 > eventlist.size()) {
				System.out.println("No next list, returning last list");
				return eventlist[eventlist.size() - 1];
			}
			else {
				getevent++;
				return eventlist[getevent - 1];
			}
		}
		public void RemoveFirstList() {
			eventlist.remove(0);
			getevent--;
		}
		public void PrintEventsByTime() {
			List<Integer> newlist = new List<Integer>();
			for(int a = 0; a < eventlist.size(); a++) {
				newlist.add(eventlist[a].time);
			}
			Collections.sort(newlist);
			for(int i : newlist) System.out.println(i);
		}
	}
	public static void main(String[] args) {
		//a. Make the event list
		EventList events = new EventList();
		events.add(1);
		events.add(2);
		events.add(4);
		events.add(3);
		
		//b. remove first item in eventlist
		events.RemoveFirstList();
		
		//c. print events by time
		System.out.println("e");
	}
}