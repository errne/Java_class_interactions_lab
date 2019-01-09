import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    private Restaurant restaurant1;
    private Guest ross;
    @Before
    public void before(){
        restaurant1 = new Restaurant(5, "Deluxe");
        ross = new Guest("Ross");
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, restaurant1.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Deluxe", restaurant1.getName());
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, restaurant1.getGuestCount());
    }
}
