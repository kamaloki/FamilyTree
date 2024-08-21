package Family_tree.view.commands;

import Family_tree.view.ConsoleUI;

public abstract class Command {
    private final String description;
    private ConsoleUI consoleUI;

    public Command(ConsoleUI consoleUI, String description) {
        this.consoleUI = consoleUI;
        this.description = description;
    }

    ConsoleUI getConsoleUI() {
        return consoleUI;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
