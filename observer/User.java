package observer;

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String tripName, int seatsFilled) {
        System.out.println(name + ": Seats filled in the bus for trip " + tripName + ": " + seatsFilled);
    }
}