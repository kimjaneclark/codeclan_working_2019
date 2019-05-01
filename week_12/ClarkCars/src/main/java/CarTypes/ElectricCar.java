package CarTypes;

public class ElectricCar extends Vehicle {

    private int batteryLife;

    public ElectricCar(String make, String model, double price, String colour, int batteryLife){
        super(make, model, price, colour);
        this.batteryLife = batteryLife;

    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}
