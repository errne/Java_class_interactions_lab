import java.util.ArrayList;

public class Gym {
    private int capacity;
    private String name;
    private ArrayList<Guest>guests;

    public Gym(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest borna) {
        guests.add(borna);
    }

    public void removeGuest(Guest borna) {
        guests.remove(borna);
    }
}
