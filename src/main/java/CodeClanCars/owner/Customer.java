package CodeClanCars.owner;

import CodeClanCars.vehicles.Car;
import CodeClanCars.vehicles.Motorbike;
import CodeClanCars.vehicles.Van;
import CodeClanCars.vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Car> collection;
    private ArrayList<Motorbike> motorbike;
    private ArrayList<Van> van;

    public Customer(double money) {
        collection = new ArrayList<Car>();
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Car> getCar() {
        return collection;
    }

    public void setCar(ArrayList<Car> car) {
        this.collection = car;
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

    public void addVehicleToCollection(Car car){
        this.collection.add(car);
    }

    public void takeMoney(Car car){
        car.getPrice() - this.money;
    }

    public void purchaseVehicle(Car car){
        if (this.money >= car.getPrice()) {
            addVehicleToCollection(car);

        }
    }
}
