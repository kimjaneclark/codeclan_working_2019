import java.util.ArrayList;

public class BallRoom {

    private int capacity;
    private String setup;
    private ArrayList<Guest> guests;

    public BallRoom(int capacity, String setup) {
        this.capacity = capacity;
        this.setup = setup;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public int countGuests() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
