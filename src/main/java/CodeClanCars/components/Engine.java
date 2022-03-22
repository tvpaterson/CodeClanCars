package CodeClanCars.components;

public class Engine {

    private double size;
    private FuelType fuelType;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Engine(double size, FuelType fuelType) {
        this.size = size;
        this.fuelType = fuelType;
    }
}
