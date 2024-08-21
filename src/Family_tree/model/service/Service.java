package Family_tree.model.service;

import Family_tree.Family_tree.FamilyTree;
import Family_tree.model.Human.Human;

public class Service {
    private FamilyTree<Human> familyTree;

    public Service(){
        familyTree = new FamilyTree<>();
    }

    public void addHuman(String name, String gender, int yearOfBirth){
        Human human = familyTree.add(name, gender, yearOfBirth);
        familyTree.add(human);
    }
    public String getServiceListInfo(){
        StringBuilder stringBouilder = new StringBuilder();
        stringBouilder.append("Список людей: \n");
        for(Human human: familyTree){
            stringBouilder.append(human);
            stringBouilder.append("\n");
        }
        return stringBouilder.toString();
    }
    public void sortByName(){
        familyTree.sortByName();
    }
    public void sortByYear(){
        familyTree.sortByYear();
    }
}
