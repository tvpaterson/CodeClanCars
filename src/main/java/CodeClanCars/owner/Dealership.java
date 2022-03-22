package CodeClanCars.owner;

import CodeClanCars.vehicles.Car;
import CodeClanCars.vehicles.Motorbike;
import CodeClanCars.vehicles.Van;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Car> car;
    private ArrayList<Motorbike> motorbike;
    private ArrayList<Van> van;

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Car> getCar() {
        return car;
    }

    public void setCar(ArrayList<Car> car) {
        this.car = car;
    }

    public ArrayList<Motorbike> getMotorbike() {
        return motorbike;
    }

    public void setMotorbike(ArrayList<Motorbike> motorbike) {
        this.motorbike = motorbike;
    }

    public ArrayList<Van> getVan() {
        return van;
    }

    public void setVan(ArrayList<Van> van) {
        this.van = van;
    }

    public Dealership(double till) {
        this.till = till;
    }
}
