import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Bedroom bedroom1;
    private Guest ross;
    @Before
    public void before(){
        bedroom1 = new Bedroom(5, "Double", "1", 7500);
        ross = new Guest("Ross");
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, bedroom1.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("1", bedroom1.getName());
    }

    @Test
    public void hasGuestList(){
        assertEquals(0, bedroom1.getGuestCount());
    }

    @Test
    public void hasType(){
        assertEquals("Double", bedroom1.getType());
    }

    @Test
    public void hasRate(){
        assertEquals(7500, bedroom1.getRate());
    }

    @Test
    public void addGuest(){
        bedroom1.addGuest(ross);
        assertEquals(1, bedroom1.getGuestCount());
    }
}
