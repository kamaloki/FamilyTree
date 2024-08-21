package Family_tree.view;

import Family_tree.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View{
    private Scanner scanner;
    private boolean work;
    private Presenter presenter;
    private MainMenu menu;

    public ConsoleUI() {
        this.scanner = new Scanner(System.in);
        work = true;
        presenter = new Presenter(this);
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Привет!");
        while (work){
            System.out.println(menu.menu());
            String choiceStr = scanner.nextLine();
            // метод проверки на волидность
            int choice = Integer.parseInt(choiceStr);
            menu.execute(choice);
        }
    }

    public void finish() {
        work = false;
        scanner.close();
        System.out.println("До новых встреч!");
    }

    public void sortByYear() {
        presenter.sortByYear();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getHumanListInfo() {
        presenter.getHumanListInfo();
    }

    public void addHuman(){
        System.out.println("Укажите имя");
        String name = scanner.nextLine();

        System.out.println("Укажите гендер(Male/Female)");
        String gender = scanner.nextLine();

        System.out.println("Укажите возраст");
        String ageStr = scanner.nextLine();
        int age = Integer.parseInt(ageStr);

        presenter.addHuman(name, gender, age);
    }

    @Override
    public void printAnswer(String answer) {
        System.out.println(answer);
    }
}
