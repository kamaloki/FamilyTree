package Family_tree;

import Family_tree.Family_tree.FamilyTree;
import Family_tree.Human.Gender;
import Family_tree.Human.Human;
import Family_tree.Writer.FileHander;

public class Main {
    public static void main(String[] args){
        FamilyTree tree  = new FamilyTree();

        Human mira = new Human("Мираслава", Gender.Male);
        Human mateo = new Human("Матео", Gender.Female);

        tree.add(mira);
        tree.add(mateo);
        tree.setWidding(mira, mateo);

        Human kira = new Human("Кира", Gender.Male, mira, mateo);
        Human sema = new Human("Семен", Gender.Female, mira, mateo);

        tree.add(kira);
        tree.add(sema);

        saveTree(tree);
    }
    private static FamilyTree readTree(){
        FileHander fileHander = new FileHander();
        return (FamilyTree) fileHander.read();
    }
    private static void saveTree(FamilyTree tree){
        FileHander fileHander = new FileHander();
        fileHander.save(tree);
    }
}
