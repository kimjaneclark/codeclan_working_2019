import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();


    }

    public int passengerCount() {
        return this.passengers.size();

    }

    public void addPassenger(Person person) {
        if (capacity > passengerCount()) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUpFromBusStop(BusStop busStop) {
        if(passengerCount() < capacity){
            Person personRemoved = busStop.removePassenger();
            this.addPassenger(personRemoved);
        }
    }


}
