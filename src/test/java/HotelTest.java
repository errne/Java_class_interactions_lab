import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest borna;
    private Bedroom bedroom1;
    private Gym gym1;
    private Gym gym2;
    private Gym[] gyms;
    private Restaurant[] restaurants;
    private Restaurant restaurant1;
    private ArrayList<Bedroom> bedrooms;
    private Bedroom bedroom2;
    private Booking booking1;

    @Before
    public void before() {
        bedroom1 = new Bedroom(2, "double", "1", 7500);
        bedroom2 = new Bedroom(1, "single", "2", 7500);
        bedrooms = new ArrayList<>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);

        gym1 = new Gym(3, "deluxe");
        gym2 = new Gym(4, "super_deluxe");
        gyms = new Gym[2];
        gyms[0] = gym1;
        gyms[1] = gym2;

        restaurant1 = new Restaurant(3, "maccas");
        restaurants = new Restaurant[1];
        restaurants[0] = restaurant1;

        borna = new Guest("Borna");

        booking1 = new Booking(bedroom1, 5, borna);

        hotel = new Hotel("CodeClan Towers", gyms, restaurants, bedrooms );
    }

    @Test
    public void hasName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hasBedrooms() {
        assertEquals(2, hotel.roomCount());
    }

    @Test
    public void hasGyms() {
        assertEquals(2, hotel.gymCount());
    }

    @Test
    public void hasRestaurants() {
        assertEquals(1, hotel.restaurantCount());
    }

    @Test
    public void canCheckInGuestBedroom() {
        hotel.addGuestBedroom(borna, bedroom1);
        assertEquals(1, bedroom1.getGuestCount());
    }

    @Test
    public void canCheckOutGuestBedroom() {
        hotel.addGuestBedroom(borna, bedroom1);
        hotel.removeGuestBedroom(borna, bedroom1);
        assertEquals(0, bedroom1.getGuestCount());
    }

    @Test
    public void canCheckInGuestGym() {
        hotel.addGuestGym(borna, gym1);
        assertEquals(1, gym1.getGuestCount());
    }

    @Test
    public void canCheckOutGuestGym() {
        hotel.addGuestGym(borna, gym1);
        hotel.removeGuestGym(borna, gym1);
        assertEquals(0, gym1.getGuestCount());
    }

    @Test
    public void canCheckInGuestRestaurant() {
        hotel.addGuestRestaurant(borna, restaurant1);
        assertEquals(1, restaurant1.getGuestCount());
    }

    @Test
    public void canCheckOutGuestRestaurant() {
        hotel.addGuestRestaurant(borna, restaurant1);
        hotel.removeGuestRestaurant(borna, restaurant1);
        assertEquals(0, restaurant1.getGuestCount());
    }

    @Test
    public void canFindEmptyBed(){
        hotel.addGuestBedroom(borna, bedroom1);
        Bedroom foundBedroom = hotel.findEmptyBedroom();
        assertEquals(bedroom2, foundBedroom);
    }

    @Test
    public void canCreateBooking(){
        hotel.bookRoom(bedroom1, 5, borna);
        assertEquals(1, hotel.getBookingCount());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(booking1);
        assertEquals(bedroom2, hotel.findEmptyBedroom());
    }

    @Test
    public void canCheckOut(){
        hotel.checkIn(booking1);
        int bill = hotel.checkOut(booking1);
        assertEquals(bedroom1, hotel.findEmptyBedroom());
        assertEquals(37500, bill);
    }


}
