package action;
import item.CoffeeItem;
import java.util.List;

public class CoffeeSorterByPrice {
    public static void sortCoffeeByPrice(List<CoffeeItem> items) {
        int n = items.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (items.get(j).getPrice() < items.get(minIndex).getPrice()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                CoffeeItem temp = items.get(i);
                items.set(i, items.get(minIndex));
                items.set(minIndex, temp);
            }
        }
    }
}
