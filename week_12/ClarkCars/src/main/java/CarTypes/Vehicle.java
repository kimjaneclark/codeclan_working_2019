package CarTypes;

public abstract class Vehicle {


        private String make;
        private String model;
        private double price;
        private String colour;



        public Vehicle(String make, String model, double price, String colour) {
            this.make = make;
            this.model = model;
            this.price = price;
            this.colour = colour;

        }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
