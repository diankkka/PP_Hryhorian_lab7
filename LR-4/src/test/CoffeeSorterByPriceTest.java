package test;
import action.CoffeeSorterByPrice;
import item.CoffeeItem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CoffeeSorterByPriceTest {

    @Test
    public void testSortCoffeeByPrice() {
        List<CoffeeItem> items = new ArrayList<>();
        items.add(new CoffeeItem("Arabica", "Roasted", 15.99, 0.5));
        items.add(new CoffeeItem("Robusta", "Ground", 10.0, 0.8));
        items.add(new CoffeeItem("Arabica", "Green", 20.0, 0.6));
        items.add(new CoffeeItem("Robusta", "Roasted", 12.5, 1.0));

        CoffeeSorterByPrice.sortCoffeeByPrice(items);

        assertEquals(10.0, items.get(0).getPrice(), 0.001);
        assertEquals(12.5, items.get(1).getPrice(), 0.001);
        assertEquals(15.99, items.get(2).getPrice(), 0.001);
        assertEquals(20.0, items.get(3).getPrice(), 0.001);
    }
}
