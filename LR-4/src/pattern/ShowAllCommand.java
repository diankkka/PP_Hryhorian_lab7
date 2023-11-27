package pattern;
import item.CoffeeTruck;
public class ShowAllCommand implements Command {
    private CoffeeTruck coffeeTruck;

    public ShowAllCommand(CoffeeTruck coffeeTruck) {
        this.coffeeTruck = coffeeTruck;
    }

    @Override
    public void execute() {
        System.out.println("\nList of all goods in the van:");
        System.out.println(coffeeTruck.toString());
    }

    @Override
    public String getCommandName() {
        return "show_all";
    }
}
