package View;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;
import java.lang.NullPointerException;

import Model.*;
import Presenter.*;

public class ConsoleUI implements View {

    private static final String INPUT_ERROR = "Вы ввели неверное значение";
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        hello();
        while (work) {
            printMenu();
            execute();
        }
    }

    public void finish() {
        System.out.println("Всего доброго!");
        work = false;
    }

    public void sortByAge() {
        presenter.sortByAge();
        presenter.getFamilyInfo();
    }

    public void sortByName() {
        presenter.sortByName();
        presenter.getFamilyInfo();
    }

    public void save() {
        presenter.saveFile();
    }

    public void load() {
        presenter.load();
    }

    public void getFamilyInfo() {
        presenter.getFamilyInfo();
    }

    public void addAnimal() {
        System.out.print("Добавить животное \nВведите имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите пол (Male/Female): ");
        Gender gender = Gender.valueOf(scanner.nextLine());
        System.out.print("Введите дату рождения в формате ГГГГ-ММ-ДД: ");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
        System.out.print("Введите исполняемые животным комманды ( Сидеть / Лежать / Голос / Нести ): ");
        String orders = scanner.nextLine();
        System.out.print("Введите тип животного ( Cat / Dog / Hamster / Horse / Camel / Donkey ): ");
        String familyStatus = scanner.nextLine();
        System.out.printf("Имя: %s\n", name, "тип: %n\n", familyStatus);
        presenter.addAnimal(name, gender, dateOfBirth, orders, familyStatus);
    }

    public void delAnimal() {
        System.out.print("Удалить животное \nВведите имя: ");
        String name = scanner.nextLine();
        FamilyMember animal = presenter.findAnimal(name);
        if (animal == null) {
            System.out.println("Нет такого животного!");
        } else {
            presenter.removeFamilyMember(animal);
            System.out.printf("Удалили - имя: %s\n", animal.getNameFamilyMember() + ", возраст: " + animal.getAgeFamilyMember());
        }
    }

    private void hello() {
        System.out.println("\nHello World! :) Это реестр моих животных.\n");
    }

    private void execute() {
        String line = scanner.nextLine();
        if (checkTextForInt(line)) {
            int numCommand = Integer.parseInt(line);
            if (checkCommand(numCommand)) {
                menu.execute(numCommand);
            }
        }
    }

    private boolean checkTextForInt(String text) {
        if (text.matches("[1-9]")) {
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private boolean checkCommand(int numCommand) {
        if (numCommand < menu.getSize() + 1) {
            return true;
        } else {
            inputError();
            return false;
        }
    }

    private void printMenu() {
        System.out.println(menu.menu());
    }

    private void inputError() {
        System.out.println(INPUT_ERROR);
    }

}