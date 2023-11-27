package pattern;

import action.CoffeeSorterByWeight;
import item.CoffeeTruck;

public class SortByWeightCommand implements Command{
    private CoffeeTruck coffeeTruck;

    public SortByWeightCommand(CoffeeTruck coffeeTruck) {
        this.coffeeTruck = coffeeTruck;
    }
    @Override
    public void execute() {

        CoffeeSorterByWeight.sortCoffeeByWeight(coffeeTruck.getItems());

        System.out.println("\nList of products that meet the specified quality criteria:");
        System.out.println(coffeeTruck.toString());
    }
    @Override
    public String getCommandName() {
        return "sort_by_weight";
    }
}
