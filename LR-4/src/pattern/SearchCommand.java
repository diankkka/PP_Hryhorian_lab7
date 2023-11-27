package pattern;
import java.util.List;
import java.util.Scanner;
import action.CoffeeSearcher;
import item.CoffeeTruck;
import item.CoffeeItem;


public class SearchCommand implements Command {
    private CoffeeTruck coffeeTruck;

    public SearchCommand(CoffeeTruck coffeeTruck) {
        this.coffeeTruck = coffeeTruck;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a minimum price: ");
        double minPrice = scanner.nextDouble();

        System.out.print("Enter the maximum price: ");
        double maxPrice = scanner.nextDouble();

        System.out.print("Enter the minimum weight: ");
        double minWeight = scanner.nextDouble();

        System.out.print("Enter the maximum weight: ");
        double maxWeight = scanner.nextDouble();

        List<CoffeeItem> filteredItems = CoffeeSearcher.findCoffeeByQuality(coffeeTruck.getItems(), minPrice, maxPrice, minWeight, maxWeight);

        System.out.println("\nList of products that meet the specified quality criteria:");
        for (CoffeeItem item : filteredItems) {
            System.out.println(item.toString());
        }
    }


    @Override
    public String getCommandName() {
        return "search";
    }


}
