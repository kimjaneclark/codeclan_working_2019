import Dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void setup() {
        dealership = new Dealership();
    }

    @Test
    public void carStockStartsAtZero(){
        assertEquals(0, dealership.countVehiclesStock());

    }

}
