package Dealership;

import CarTypes.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehicleStock;


    public Dealership(){
        this.vehicleStock = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getVehicleStock() {
        return vehicleStock;
    }

    public void setVehicleStock(ArrayList<Vehicle> vehicleStock) {
        this.vehicleStock = vehicleStock;
    }

    public int countVehiclesStock(){
        return this.vehicleStock.size();
    }
}
