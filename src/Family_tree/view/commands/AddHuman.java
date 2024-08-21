package Family_tree.view.commands;

import Family_tree.view.ConsoleUI;

public class AddHuman extends Command{
    public AddHuman(ConsoleUI consoleUI) {
        super(consoleUI, "Добавить человека");
    }

    @Override
    public void execute() {
        getConsoleUI().addHuman();
    }


}
