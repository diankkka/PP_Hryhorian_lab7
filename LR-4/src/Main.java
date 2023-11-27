import item.CoffeeTruck;
import pattern.Command;
import pattern.AddCommand;
import pattern.ShowAllCommand;
import pattern.SearchCommand;
import pattern.SortByPriceCommand;
import pattern.SortByWeightCommand;
import pattern.ExitCommand;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoffeeTruck coffeeTruck = new CoffeeTruck(500);

        Map<String, Command> commandMap = new HashMap<>();
        commandMap.put("add", new AddCommand(coffeeTruck));
        commandMap.put("show_all", new ShowAllCommand(coffeeTruck));
        commandMap.put("search", new SearchCommand(coffeeTruck));
        commandMap.put("sort_by_price", new SortByPriceCommand(coffeeTruck));
        commandMap.put("sort_by_weight", new SortByWeightCommand(coffeeTruck));
        commandMap.put("exit", new ExitCommand());

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n┌────────────────────────────────────┐");
            System.out.println("  Choose an action in terms of items:");
            System.out.println("└────────────────────────────────────┘");
            System.out.println("┌─────────────────────┐");
            for (var entry : commandMap.entrySet()) {
                System.out.println("│  • " + entry.getKey() );
            }
            System.out.println("└─────────────────────┘");
            System.out.print("Enter a command: ");

            String choice = scanner.next();

            Command command = commandMap.get(choice);

            if (command != null) {
                command.execute();
            } else {
                System.out.println("Invalid command name.");
            }
            if (choice.equals("exit")) {
                break;
            }
        }
    }
}

