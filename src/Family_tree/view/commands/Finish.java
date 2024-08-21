package Family_tree.view.commands;

import Family_tree.view.ConsoleUI;

public class Finish extends Command {
    public Finish(ConsoleUI consoleUI) {
        super(consoleUI, "Завершение работы");
    }

    @Override
    public void execute() {
        getConsoleUI().finish();
    }
}
