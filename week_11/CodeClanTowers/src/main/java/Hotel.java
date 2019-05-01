import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferencerooms;
    private ArrayList<BallRoom> ballrooms;


    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferencerooms = new ArrayList<ConferenceRoom>();
        this.ballrooms = new ArrayList<BallRoom>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }


    public void checkIn(Bedroom bedroom, Guest guest) {
        if (this.bedrooms.contains(bedroom)) {
            bedroom.addGuest(guest);
        }
    }

    public int countConferenceRooms() {
        return this.conferencerooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceroom) {
        this.conferencerooms.add(conferenceroom);
    }


    public void checkInConferenceRoom(ConferenceRoom conferenceroom, Guest guest) {
        if (this.conferencerooms.contains(conferenceroom)) {
            conferenceroom.addGuest(guest);
        }
    }
}
