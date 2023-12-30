package View.commands;

import View.*;

public class AddAnimal extends Command {

    public AddAnimal(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить животное";
    }

    public void execute() {
        consoleUI.addAnimal();
    }
}