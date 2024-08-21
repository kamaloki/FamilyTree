package Family_tree.view.commands;

import Family_tree.view.ConsoleUI;

public class SortByYear extends Command {
    public SortByYear(ConsoleUI consoleUI) {
        super(consoleUI, "Сортировать по возрасту");
    }

    @Override
    public void execute() {
        getConsoleUI().sortByYear();
    }
}

