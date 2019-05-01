import CarTypes.Car;
import CarTypes.FuelType;
import CarTypes.Transmission;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public Car car;

    @Before
    public void setup(){
        car = new Car("VW", "Golf",15000.0, "Blue", Transmission.AUTOMATIC, FuelType.PETROL);
    }

    @Test
    public void canGetMake(){
        assertEquals("VW", car.getMake());
    }

    @Test
    public void getModel(){
        assertEquals("Golf", car.getModel());
    }

    @Test
    public void getPrice(){
        assertEquals(15000, car.getPrice(), 0.01);
    }

    @Test
    public void getColour(){
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void getTransmission(){
        assertEquals(Transmission.AUTOMATIC, car.getTransmission());
    }

    @Test
    public void getFuelType(){
        assertEquals(FuelType.PETROL, car.getFuel());
    }



}
