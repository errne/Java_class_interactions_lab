import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GymTest {
    private Gym gym1;
    private Guest ross;
    @Before
    public void before(){
        gym1 = new Gym(5, "Deluxe");
        ross = new Guest("Ross");
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, gym1.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Deluxe", gym1.getName());
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, gym1.getGuestCount());
    }
}
