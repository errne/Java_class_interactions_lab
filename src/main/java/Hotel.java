import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private Gym[] gyms;
    private ArrayList<Bedroom> bedrooms;
    private Restaurant[] restaurants;
    private ArrayList<Booking>bookings;

    public Hotel ( String nameInput, Gym[] gymsInput, Restaurant[] restaurantsInput, ArrayList<Bedroom> bedroomsInput ) {
        bedrooms = bedroomsInput;
        gyms = gymsInput;
        restaurants = restaurantsInput;
        name = nameInput;
        bookings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }


    public int roomCount() {
        return bedrooms.size();
    }

    public int gymCount() {
        return gyms.length;
    }

    public int restaurantCount() {
        return restaurants.length;
    }

    public void addGuestBedroom(Guest borna, Bedroom room) {
            room.addGuest(borna);
        }


    public void removeGuestBedroom(Guest borna, Bedroom room) {
        room.removeGuest(borna);
    }

    public void addGuestGym(Guest borna, Gym room) {
        room.addGuest(borna);
    }

    public void removeGuestGym(Guest borna, Gym room) {
        room.removeGuest(borna);
    }

    public void addGuestRestaurant(Guest borna, Restaurant room) {
        room.addGuest(borna);
    }

    public void removeGuestRestaurant(Guest borna, Restaurant room) {
        room.removeGuest(borna);
    }

    public Bedroom findEmptyBedroom(){
        Bedroom bedroom = null;
        for (Bedroom bed:bedrooms) {
            if (bed.getGuestCount()==0){
                 bedroom = bed;
                 break;
            }
        }
        return bedroom;
    }

    public Booking bookRoom(Bedroom bedroom, int nights, Guest guest){
         Booking newBooking = new Booking(bedroom, nights, guest);
         bookings.add(newBooking);
         return newBooking;
    }

    public void checkIn(Booking booking){
        addGuestBedroom(booking.getGuest(), booking.getBed());
    }

    public int getBookingCount(){
        return bookings.size();
    }

    public int checkOut(Booking booking){
        removeGuestBedroom(booking.getGuest(), booking.getBed());
        return booking.getBill();
    }
}

