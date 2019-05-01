import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusStopTest {

    public BusStop busstop;
    public Bus bus;
    public Person person;

    @Before
    public void setup() {
        busstop = new BusStop("Polmont");
        person = new Person();
        bus = new Bus("Edinburgh", 3);

    }

    @Test
    public void queueCount() {
        assertEquals(0, busstop.queueCount());
    }

    @Test
    public void canAddPersonToQueue(){
        busstop.addPassenger(person);
        assertEquals(1, busstop.queueCount());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busstop.addPassenger(person);
        busstop.removePassenger(person);
        assertEquals(0, busstop.queueCount());

    }
}
