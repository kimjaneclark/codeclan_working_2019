package Dealership;

public class Till{

    private double tillTotal;

    public Till(double tillTotal){
        this.tillTotal = tillTotal;
    }

    public double getTillTotal() {
        return tillTotal;
    }

    public void setTillTotal(double tillTotal) {
        this.tillTotal = tillTotal;
    }

    public double addToTill(double cash) {
        return tillTotal += cash;
    }

    public double removeFromTill(double cash ) {
        return tillTotal -= cash;
    }
}
