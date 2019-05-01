import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    public ConferenceRoom conferenceroom;
    public Guest guest;


    @Before
    public void setup() {
        conferenceroom = new ConferenceRoom("Tay", 25);
        guest = new Guest("Kimberley");
    }

    @Test
    public void canGetCapacity() {
        assertEquals(25, conferenceroom.getCapacity());
    }

    @Test
    public void canGetName() {
        assertEquals("Tay", conferenceroom.getName());
    }


    @Test
    public void canUpdateCapacity(){
        conferenceroom.setCapacity(30);
        assertEquals(30, conferenceroom.getCapacity());
    }


    @Test
    public void canUpdateName(){
        conferenceroom.setName("Lomond");
        assertEquals("Lomond", conferenceroom.getName());
    }


    @Test
    public void checkGuestStartsEmpty(){
        assertEquals(0, conferenceroom.countGuests());
    }

    @Test
    public void addGuestToConferenceRoom(){
        conferenceroom.addGuest(guest);
        assertEquals(1, conferenceroom.countGuests());
    }

    @Test
    public void removeGuestFromConferenceRoom(){
        conferenceroom.addGuest(guest);
        conferenceroom.removeGuest(guest);
        assertEquals(0, conferenceroom.countGuests());

    }

}
