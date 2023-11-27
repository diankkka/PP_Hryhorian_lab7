package pattern;

import item.CoffeeTruck;
import action.CoffeeSorterByPrice;


public class SortByPriceCommand implements Command{
    private CoffeeTruck coffeeTruck;

    public SortByPriceCommand(CoffeeTruck coffeeTruck) {
        this.coffeeTruck = coffeeTruck;
    }
    @Override
    public void execute() {

        CoffeeSorterByPrice.sortCoffeeByPrice(coffeeTruck.getItems());

        System.out.println("\nList of products that meet the specified quality criteria:");
        System.out.println(coffeeTruck.toString());
    }
    @Override
    public String getCommandName() {
        return "sort_by_price";
    }
}
