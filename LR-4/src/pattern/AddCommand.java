package pattern;
import item.CoffeeTruck;
import java.util.Scanner;


public class AddCommand implements Command {
    private CoffeeTruck coffeeTruck;

    public AddCommand(CoffeeTruck coffeeTruck) {
        this.coffeeTruck = coffeeTruck;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of coffee: ");
        String type = scanner.nextLine();

        System.out.print("Enter the condition of coffee: ");
        String condition = scanner.nextLine();

        System.out.print("Enter the volume of coffee: ");
        double volume = scanner.nextDouble();

        System.out.print("Enter the price of coffee: ");
        double price = scanner.nextDouble();

        coffeeTruck.loadCoffee(type, condition, volume, price);
    }

    @Override
    public String getCommandName() {
        return "add";
    }
}
