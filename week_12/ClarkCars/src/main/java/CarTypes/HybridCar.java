package CarTypes;

public class HybridCar extends Vehicle {

    private FuelType fuel;


    public HybridCar(String make, String model, double price, String colour, FuelType fuel){
        super(make, model, price, colour);
        this.fuel = fuel;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }
}
