import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {



    public Bedroom bedroom;
    public Guest guest;


    @Before
    public void setup() {
        bedroom = new Bedroom(3, 2, "Twin");
        guest = new Guest("Kimberley");
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void canGetType() {
        assertEquals("Twin", bedroom.getType());
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(3, bedroom.getRoomnumber());
    }

    @Test
    public void canUpdateCapacity(){
        bedroom.setCapacity(4);
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void canRoomNumber(){
        bedroom.setRoomnumber(15);
        assertEquals(15, bedroom.getRoomnumber());
    }

    @Test
    public void canUpdateRoomType(){
        bedroom.setType("Family");
        assertEquals("Family", bedroom.getType());
    }


    @Test
    public void checkGuestStartsEmpty(){
        assertEquals(0, bedroom.countGuests());
    }

    @Test
    public void addGuestToBedroom(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.countGuests());
    }

    @Test
    public void removeGuestFromBedroom(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.countGuests());

    }


}
