package CodeClanCars.vehicles;

import CodeClanCars.components.Engine;
import CodeClanCars.components.Seats;
import CodeClanCars.components.Tyres;

public abstract class Vehicle{

    private String model;
    private String colour;
    private double price;
    private Engine engine;
    private Seats seats;
    private Tyres tyres;


    public Vehicle(String model, String colour, double price, Engine engine, Seats seats, Tyres tyres) {
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.seats = seats;
        this.tyres = tyres;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
