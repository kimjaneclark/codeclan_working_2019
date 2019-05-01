import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    public Guest guest1;
    public Guest guest2;
    public Guest guest3;
    public Hotel hotel;
    public Bedroom bedroom1;
    public Bedroom bedroom2;
    public Bedroom bedroom3;
    public ConferenceRoom conferenceroom1;
    public ConferenceRoom conferenceroom2;


    @Before
    public void setup() {
        guest1 = new Guest("Kimberley");
        guest2 = new Guest("Abigail");
        guest3 = new Guest("Ken");
        hotel = new Hotel("Code Clan Towers");
        bedroom1 = new Bedroom(1,2, "Twin");
        bedroom2 = new Bedroom(2,4, "Family");
        bedroom3 = new Bedroom(3, 2, "Double");
        conferenceroom1 = new ConferenceRoom("Tay", 20);
        conferenceroom2 = new ConferenceRoom("Lomond", 10);

    }

    @Test
    public void checkBedroomsStartsEmpty(){
        assertEquals(0, hotel.countBedrooms());
    }


    @Test
    public void addBedrooms(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.countBedrooms());
    }

    @Test
    public void checkInWorks(){
        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.checkIn(bedroom1, guest2);
        assertEquals(1, bedroom1.countGuests());
    }

    @Test
    public void checkConferenceRoomsStartsEmpty(){
        assertEquals(0, hotel.countConferenceRooms());
    }


    @Test
    public void addConferenceRoom(){
        hotel.addConferenceRoom(conferenceroom1);
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void checkInWorksConferenceRoom(){
        hotel.addConferenceRoom(conferenceroom1);
        hotel.addConferenceRoom(conferenceroom2);
        hotel.checkInConferenceRoom(conferenceroom2, guest1);
        assertEquals(1, conferenceroom2.countGuests());
    }


}
