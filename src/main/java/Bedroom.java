import java.util.ArrayList;

public class Bedroom {
    private int capacity;
    private String type;
    private String name;
    private ArrayList<Guest> guests;
    private int rate;

    public Bedroom(int capacity, String type, String name, int rate) {
        this.capacity = capacity;
        this.type = type;
        this.name = name;
        this.guests = new ArrayList<>();
        this.rate = rate;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public String getName(){
        return this.name;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest borna) {
        guests.remove(borna);
    }

    public int getRate(){

        return rate;
    }
}
