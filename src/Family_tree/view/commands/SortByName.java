package Family_tree.view.commands;

import Family_tree.view.ConsoleUI;

public class SortByName extends Command {
    public SortByName(ConsoleUI consoleUI) {
        super(consoleUI, "Сортировать по имени");
    }

    @Override
    public void execute() {
        getConsoleUI().sortByName();
    }
}
