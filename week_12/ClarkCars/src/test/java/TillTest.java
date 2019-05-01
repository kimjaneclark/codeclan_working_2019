import Dealership.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TillTest {

 public Till till;

    @Before
    public void setup(){
     till = new Till(100000);
    }

    @Test
    public void getTillTotal(){
     assertEquals(100000, till.getTillTotal(), 0.01);
    }


    @Test
    public void canAcceptPayment(){
        assertEquals(110000.00, till.addToTill(10000.0), 0.01);
    }

    @Test
    public void canReduceTill(){
        assertEquals(90000, till.removeFromTill(10000), 0.01);
    }




}
