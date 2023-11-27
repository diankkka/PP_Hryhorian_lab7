package test;
import org.junit.Before;
import org.junit.Test;
import item.CoffeeItem;
import item.CoffeeTruck;
import java.util.List;
import static org.junit.Assert.*;

public class CoffeeTruckTest {

    private CoffeeTruck coffeeTruck;

    @Before
    public void setUp() {
        coffeeTruck = new CoffeeTruck(500);
    }

    @Test
    public void testLoadCoffeeSuccess() {
        coffeeTruck.loadCoffee("Arabica", "Fresh", 0.2, 30);
        List<CoffeeItem> items = coffeeTruck.getItems();
        assertEquals(1, items.size());
    }

    @Test
    public void testLoadCoffeeFailure() {
        CoffeeTruck truck = new CoffeeTruck(5);

        truck.loadCoffee("type1", "condition1", 1.5, 2.0);
        truck.loadCoffee("type2", "condition2", 1.0, 1.0);

        assertEquals(2.5, truck.getTotalWeight(), 0.001);
    }

    @Test
    public void testToString() {
        coffeeTruck.loadCoffee("Arabica", "Fresh", 0.2, 30);
        coffeeTruck.loadCoffee("Robusta", "Roasted", 0.3, 25);

        String expected = "\nType: Arabica, State: Fresh, Weight: 0.2 kg, Price: 30.0 grn\n" +
                "Type: Robusta, State: Roasted, Weight: 0.3 kg, Price: 25.0 grn\n";

        assertEquals(expected, coffeeTruck.toString());
    }

    @Test
    public void testGetTotalWeight() {
        coffeeTruck.loadCoffee("Arabica", "Fresh", 0.2, 30);
        coffeeTruck.loadCoffee("Robusta", "Roasted", 0.3, 25);

        assertEquals(0.5, coffeeTruck.getTotalWeight(), 0.01);
    }
}
