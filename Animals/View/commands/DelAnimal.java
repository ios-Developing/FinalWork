package View.commands;

import View.ConsoleUI;

public class DelAnimal extends Command {

    public DelAnimal(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Удалить животное";
    }

    public void execute() {
        consoleUI.delAnimal();
    }
}