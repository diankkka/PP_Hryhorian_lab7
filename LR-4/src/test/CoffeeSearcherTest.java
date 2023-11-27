package test;
import action.CoffeeSearcher;
import item.CoffeeItem;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CoffeeSearcherTest {

    @Test
    public void testFindCoffeeByQuality() {
        List<CoffeeItem> items = new ArrayList<>();
        items.add(new CoffeeItem("Arabica", "Roasted", 15.99, 0.5));
        items.add(new CoffeeItem("Robusta", "Ground", 10.0, 0.8));
        items.add(new CoffeeItem("Arabica", "Green", 20.0, 0.6));
        items.add(new CoffeeItem("Robusta", "Roasted", 12.5, 1.0));

        double minPrice = 10.0;
        double maxPrice = 16.0;
        double minWeight = 0.6;
        double maxWeight = 1.0;

        List<CoffeeItem> result = CoffeeSearcher.findCoffeeByQuality(items, minPrice, maxPrice, minWeight, maxWeight);

        assertEquals(2, result.size());  // очікую, що буде знайдено 2 елементи
        // перевіряю, чи всі елементи відповідають вимогам
        for (CoffeeItem item : result) {
            assertEquals(true, item.getPrice() >= minPrice && item.getPrice() <= maxPrice);
            assertEquals(true, item.getWeight() >= minWeight && item.getWeight() <= maxWeight);
        }
    }
}
