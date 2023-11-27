package test;
import action.CoffeeSorterByWeight;
import item.CoffeeItem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CoffeeSorterByWeightTest {

    @Test
    public void testSortCoffeeByWeight() {
        List<CoffeeItem> items = new ArrayList<>();
        items.add(new CoffeeItem("Arabica", "Roasted", 15.99, 0.5));
        items.add(new CoffeeItem("Robusta", "Ground", 10.0, 0.8));
        items.add(new CoffeeItem("Arabica", "Green", 20.0, 0.6));
        items.add(new CoffeeItem("Robusta", "Roasted", 12.5, 1.0));

        CoffeeSorterByWeight.sortCoffeeByWeight(items);

        assertEquals(0.5, items.get(0).getWeight(), 0.001);
        assertEquals(0.6, items.get(1).getWeight(), 0.001);
        assertEquals(0.8, items.get(2).getWeight(), 0.001);
        assertEquals(1.0, items.get(3).getWeight(), 0.001);
    }
}
