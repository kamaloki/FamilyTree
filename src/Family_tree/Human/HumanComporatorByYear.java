package Family_tree.Human;

import Family_tree.Family_tree.ItemFamilyTree;

import java.util.Comparator;

public class HumanComporatorByYear<E extends ItemFamilyTree> implements Comparator<E> {
    public int compare(E o1, E o2) {
        return o1.getYearOfBirth() - o2.getYearOfBirth();
    }
}
