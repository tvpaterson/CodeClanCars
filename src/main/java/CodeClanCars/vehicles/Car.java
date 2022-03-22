package CodeClanCars.vehicles;

import CodeClanCars.components.Engine;
import CodeClanCars.components.Seats;
import CodeClanCars.components.Tyres;

public class Car extends Vehicle {


    public Car(String model, String colour, double price, Engine engine, Seats seats, Tyres tyres) {
        super(model, colour, price, engine, seats, tyres);
    }
}
