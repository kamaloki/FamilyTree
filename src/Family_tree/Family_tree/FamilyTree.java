package Family_tree.Family_tree;

import Family_tree.Human.Human;
import Family_tree.Human.HumanComporatorByName;
import Family_tree.Human.HumanComporatorByYear;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends ItemFamilyTree<E>> implements Serializable, Iterable<E> {
    private long humanId;
    private List<E> humanList;

    public FamilyTree(){
        this(new ArrayList<>());
    }
    public FamilyTree(List<E> humanList){
        this.humanList = humanList;
    }

    public boolean add (E human){
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

    private void addToParents(E human){
        for(E parent: human.getParents()){
            parent.addChildren(human);
        }
    }

    private void addToChildren(E human){
        for(E child: human.getChildren()){
            child.addParents(human);
        }
    }

    public List<E> getSiblings(int id){
        E human = getById(id);
        List<E> res = new ArrayList<>();
        for(E parent: human.getParents()){
            for(E child: human.getChildren()){
                if (!child.equals(human)) {
                    res.add(child);
                }
            }
        }
        return res;
    }
    public E getById(long id){
        for(E human:humanList){
            if(human.getId() == id){
                return human;
            }
        }
        return null;
    }

    public boolean setWidding(E human1, E human2){
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
        for(E human: humanList){
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }
    public Iterator<E> iterator(){
        return new FamilyTreeIterator<>(humanList);
    }
    public void sortByName(){
        humanList.sort(new HumanComporatorByName<>());
    }
    public void sortByYear(){
        humanList.sort(new HumanComporatorByYear<>());
    }
}


