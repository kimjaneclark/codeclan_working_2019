import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusTest {


    public Bus bus;
    public Person person;


    @Before
    public void setup() {
        bus = new Bus("Edinburgh", 3);
        person = new Person();

    }

    @Test
    public void passengerCount() {
        assertEquals(0, bus.passengerCount());
    }



    @Test
    public void canAddPassengerIfCapacity() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void doesNotAddPassengerIfFull(){
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }



}



