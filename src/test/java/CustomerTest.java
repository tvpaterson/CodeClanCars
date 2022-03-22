import CodeClanCars.components.Engine;
import CodeClanCars.components.FuelType;
import CodeClanCars.components.Seats;
import CodeClanCars.components.Tyres;
import CodeClanCars.owner.Customer;
import CodeClanCars.vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Engine engine1;
    Tyres tyres1;
    Seats seats1;
    Car car;
//    ArrayList<> collection;
//    ArrayList<> collection2;

    @Before
    public void before(){
        customer1 = new Customer( 4000.00);
        engine1 = new Engine(2.0, FuelType.VEGOIL);
        seats1 = new Seats(4);
        tyres1 = new Tyres(4);
        car = new Car("Suzuki Carry", "black", 1700.00, engine1, seats1, tyres1);
//        collection =  new ArrayList<>();
//        collection2 =  new ArrayList<Car car>();

    };

    @Test
    public void customerHasMoney(){
        assertEquals(4000.00, customer1.getMoney(), 0.0);
    };

    @Test
    public void customerBuysCar(){
        customer1.purchaseVehicle(car);
        assertEquals(1, customer1.getCar().size());
    };


}
