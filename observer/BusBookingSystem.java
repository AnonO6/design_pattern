package observer;
public class BusBookingSystem {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.addTrip("LNMIIT to Raja Park at 9am", 20);
        bus.addTrip("LNMIIT to Ajmeri Gate at 12noon", 20);
        bus.addTrip("Raja Park to LNMIIT at 3pm", 20);
        bus.addTrip("Ajmeri Gate to LNMIIT at 6pm", 20);

        User user1 = new User("John");
        User user2 = new User("Alice");

        bus.registerObserver(user1);
        bus.registerObserver(user2);

        // Booking seats for trips
        bus.bookSeat("LNMIIT to Raja Park at 9am");
        bus.bookSeat("LNMIIT to Ajmeri Gate at 12noon");
        bus.bookSeat("LNMIIT to Raja Park at 9am");
        bus.bookSeat("Raja Park to LNMIIT at 3pm");
        bus.bookSeat("Ajmeri Gate to LNMIIT at 6pm");
        bus.bookSeat("LNMIIT to Ajmeri Gate at 12noon");
    }
}