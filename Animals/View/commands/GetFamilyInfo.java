package View.commands;

import View.*;

public class GetFamilyInfo extends Command {
    public GetFamilyInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Вывести список животных";
    }

    public void execute() {
        consoleUI.getFamilyInfo();
    }
}
