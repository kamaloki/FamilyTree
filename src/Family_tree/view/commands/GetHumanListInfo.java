package Family_tree.view.commands;

import Family_tree.view.ConsoleUI;

public class GetHumanListInfo extends Command {
    public GetHumanListInfo(ConsoleUI consoleUI) {
        super(consoleUI, "Получить семейное древо");
    }

    @Override
    public void execute() {
        getConsoleUI().getHumanListInfo();
    }
}
