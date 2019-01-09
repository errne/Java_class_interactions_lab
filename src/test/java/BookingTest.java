import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {
    private Booking booking;
    private Bedroom bed;
    private Guest borna;
    @Before
    public void before(){
        borna = new Guest("Borna");
        bed = new Bedroom(2, "Double", "1", 7500);
        booking = new Booking(bed, 5, borna);
    }

    @Test
    public void hasNights(){
        assertEquals(5, booking.getNights());
    }

    @Test
    public void canBill(){
        assertEquals(37500, booking.getBill());
    }
}
