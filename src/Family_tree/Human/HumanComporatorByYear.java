package Family_tree.Human;

import java.util.Comparator;

public class HumanComporatorByYear implements Comparator<Human> {
    public int compare(Human o1, Human o2) {
        return o1.getYearOfBirth() - o2.getYearOfBirth();
    }
}
