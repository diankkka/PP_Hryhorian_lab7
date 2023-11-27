package test;
import org.junit.Test;
import static org.junit.Assert.*;
import item.CoffeeItem;


public class CoffeeItemTest {

    @Test
    public void testConstructorAndGetters() {
        CoffeeItem coffeeItem = new CoffeeItem("Arabica", "Roasted", 15.99, 0.5);
        assertEquals("Arabica", coffeeItem.getType());
        assertEquals("Roasted", coffeeItem.getState());
        assertEquals(15.99, coffeeItem.getPrice(), 0.001);
        assertEquals(0.5, coffeeItem.getWeight(), 0.001);
    }

    @Test
    public void testToString() {
        CoffeeItem coffeeItem = new CoffeeItem("Robusta", "Green", 12.75, 0.75);

        String expected = "Type: Robusta, State: Green, Weight: 0.75 kg, Price: 12.75 grn";
        assertEquals(expected, coffeeItem.toString());
    }

    @Test
    public void testNullType() {
        new CoffeeItem(null, "Roasted", 15.99, 0.5);
    }

    @Test
    public void testNegativePrice() {
        new CoffeeItem("Arabica", "Roasted", -5.0, 0.5);
    }

    @Test
    public void testNegativeWeight() {
        new CoffeeItem("Robusta", "Green", 12.75, -0.75);
    }
}
