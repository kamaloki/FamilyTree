package Family_tree.Family_tree;

import Family_tree.Human.Human;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private long humanId;
    private List<Human> humanList;

    public FamilyTree(){
        this(new ArrayList<>());
    }
    public FamilyTree(List<Human> humanList){
        this.humanList = humanList;
    }

    public boolean add (Human human){
        if(human == null){
            return false;
        }
        if(!humanList.contains(human)){
            humanList.add(human);
            human.setId(humanId++);

            addToParents(human);
            addToChildren(human);
            return true;
        }
        return false;
    }

    private void addToParents(Human human){
        for(Human parent: human.getParents()){
            parent.addChildren(human);
        }
    }

    private void addToChildren(Human human){
        for(Human child: human.getChildren()){
            child.addParents(human);
        }
    }

    public List<Human> getSiblings(int id){
        Human human = getById(id);
        List<Human> res = new ArrayList<>();
        for(Human parent: human.getParents()){
            for(Human child: human.getChildren()){
                if (!child.equals(human)) {
                    res.add(child);
                }
            }
        }
        return res;
    }
    public Human getById(long id){
        for(Human human:humanList){
            if(human.getId() == id){
                return human;
            }
        }
        return null;
    }

    public boolean setWidding(Human human1, Human human2){
        if(human1.getSpouse() == null && human2.getSpouse() == null){
            human1.setSpouse(human2);
            human2.setSpouse(human1);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("В дереве");
        sb.append(humanList.size());
        sb.append(" объектов: \n");
        for(Human human: humanList){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }
}


