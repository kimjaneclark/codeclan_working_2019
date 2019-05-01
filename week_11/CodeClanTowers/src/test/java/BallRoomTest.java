import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BallRoomTest {



    public BallRoom ballroom;
    public Guest guest;


    @Before
    public void setup() {
        ballroom = new BallRoom(200, "Wedding");
        guest = new Guest("Kimberley");
    }

    @Test
    public void canGetCapacity() {
        assertEquals(200, ballroom.getCapacity());
    }

    @Test
    public void canGetSetup() {
        assertEquals("Wedding", ballroom.getSetup());
    }


    @Test
    public void canUpdateCapacity(){
        ballroom.setCapacity(100);
        assertEquals(100, ballroom.getCapacity());
    }


    @Test
    public void canUpdateSetUp(){
       ballroom.setSetup("Theatre");
        assertEquals("Theatre", ballroom.getSetup());
    }


    @Test
    public void checkGuestStartsEmpty(){
        assertEquals(0, ballroom.countGuests());
    }

    @Test
    public void addGuestToConferenceRoom(){
        ballroom.addGuest(guest);
        assertEquals(1, ballroom.countGuests());
    }

    @Test
    public void removeGuestFromConferenceRoom(){
        ballroom.addGuest(guest);
        ballroom.removeGuest(guest);
        assertEquals(0, ballroom.countGuests());

    }

}
