package action;
import item.CoffeeItem;
import java.util.List;

public class CoffeeSorterByWeight {
    public static void sortCoffeeByWeight(List<CoffeeItem> items) {
        int n = items.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (items.get(i - 1).getWeight() > items.get(i).getWeight()) {
                    CoffeeItem temp = items.get(i - 1);
                    items.set(i - 1, items.get(i));
                    items.set(i, temp);
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
