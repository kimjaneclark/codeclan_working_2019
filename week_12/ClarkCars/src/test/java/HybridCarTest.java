import CarTypes.FuelType;
import CarTypes.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    public HybridCar hybridCar;

    @Before
    public void setup(){
        hybridCar= new HybridCar("Toyota", "Prius",20000.0, "White", FuelType.DIESEL);
    }

    @Test
    public void canGetMake(){
        assertEquals("Toyota", hybridCar.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("Prius", hybridCar.getModel());
    }

    @Test
    public void getPrice(){
        assertEquals(20000, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void getColour(){
        assertEquals("White", hybridCar.getColour());
    }

    @Test
    public void getFuelType(){
        assertEquals(FuelType.DIESEL, hybridCar.getFuel());
    }



}
