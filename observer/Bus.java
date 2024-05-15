package observer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Bus implements Subject {
    private Map<String, List<Observer>> observersMap = new HashMap<>();
    private Map<String, Integer> seatsCapacityMap = new HashMap<>();
    private Map<String, Integer> seatsFilledMap = new HashMap<>();

    public void addTrip(String tripName, int seatsCapacity) {
        observersMap.put(tripName, new ArrayList<>());
        seatsCapacityMap.put(tripName, seatsCapacity);
        seatsFilledMap.put(tripName, 0);
    }

    @Override
    public void registerObserver(Observer observer) {
        for (List<Observer> observers : observersMap.values()) {
            observers.add(observer);
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        for (List<Observer> observers : observersMap.values()) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(String tripName) {
        List<Observer> observers = observersMap.get(tripName);
        int seatsFilled = seatsFilledMap.get(tripName);
        for (Observer observer : observers) {
            observer.update(tripName, seatsFilled);
        }
    }

    public void bookSeat(String tripName) {
        int seatsFilled = seatsFilledMap.get(tripName);
        if (seatsFilled < seatsCapacityMap.get(tripName)) {
            seatsFilledMap.put(tripName, seatsFilled + 1);
            notifyObservers(tripName);
        } else {
            System.out.println("Sorry, no more seats available for trip: " + tripName);
        }
    }
}
