package action;
import item.CoffeeItem;
import java.util.List;
import java.util.ArrayList;

public class CoffeeSearcher {
    public static List<CoffeeItem> findCoffeeByQuality(List<CoffeeItem> items, double minPrice, double maxPrice, double minWeight, double maxWeight) {
    List<CoffeeItem> result = new ArrayList<>();
    for (CoffeeItem item : items) {
        if (item.getPrice() >= minPrice && item.getPrice() <= maxPrice
                && item.getWeight() >= minWeight && item.getWeight() <= maxWeight) {
            result.add(item);
        }
    }
    return result;
}
}
