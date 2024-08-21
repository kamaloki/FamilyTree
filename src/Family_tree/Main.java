package Family_tree;

import Family_tree.Family_tree.FamilyTree;
import Family_tree.model.Human.Gender;
import Family_tree.model.Human.Human;
import Family_tree.model.Writer.FileHander;
import Family_tree.view.ConsoleUI;
import Family_tree.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
