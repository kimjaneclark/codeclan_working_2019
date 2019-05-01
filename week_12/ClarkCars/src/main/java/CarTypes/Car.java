package CarTypes;

public class Car extends Vehicle {

    private Transmission transmission;
    private FuelType fuel;

    public Car(String make, String model, double price, String colour, Transmission transmission, FuelType fuel){
        super(make, model, price, colour);
        this.transmission = transmission;
        this.fuel = fuel;
    }


    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }
}
