import java.util.ArrayList;

public class Restaurant {
    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public Restaurant(int capacity, String name) {
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

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guest);
    }
}

