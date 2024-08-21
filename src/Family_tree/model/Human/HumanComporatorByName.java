package Family_tree.model.Human;

import Family_tree.Family_tree.ItemFamilyTree;

import java.util.Comparator;

public class HumanComporatorByName<E extends ItemFamilyTree> implements Comparator<E> {
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
