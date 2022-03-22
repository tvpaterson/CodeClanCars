import CodeClanCars.components.Engine;
import CodeClanCars.components.FuelType;
import CodeClanCars.components.Seats;
import CodeClanCars.components.Tyres;
import CodeClanCars.vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine1;
    Seats seats1;
    Tyres tyres1;

    @Before
    public void before(){
        engine1 = new Engine(2.0, FuelType.VEGOIL);
        seats1 = new Seats(4);
        tyres1 = new Tyres(4);
        car = new Car("Suzuki Carry", "black", 1700.00, engine1, seats1, tyres1);
    }

    @Test
    public void carHasColour(){
        assertEquals("black", car.getColour());
    };

}
