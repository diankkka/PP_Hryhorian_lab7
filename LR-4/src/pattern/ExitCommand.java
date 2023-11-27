package pattern;

public class ExitCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Completion of the program.");
        System.exit(0);
    }

    @Override
    public String getCommandName() {
        return "exit";
    }
}
