import CarTypes.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    public ElectricCar electricCar;

    @Before
    public void setup(){
        electricCar= new ElectricCar("BMW", "i3",25000.0, "Black", 150);
    }

    @Test
    public void canGetMake(){
        assertEquals("BMW", electricCar.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("i3", electricCar.getModel());
    }

    @Test
    public void getPrice(){
        assertEquals(25000, electricCar.getPrice(), 0.01);
    }

    @Test
    public void getColour(){
        assertEquals("Black", electricCar.getColour());
    }

    @Test
    public void getBatteryLife(){
        assertEquals(150, electricCar.getBatteryLife());
    }


}
