package Family_tree.Family_tree;

import java.io.Serializable;
import java.util.List;

public interface ItemFamilyTree<E> extends Serializable {
    String getName();
    int getYearOfBirth();
    List<E> getParents();
    E getFather();
    E getMother();
    long getId();
    void setId(long id);
    List<E> getChildren();
    E getSpouse();
    void setSpouse(E human);
    boolean addChildren(E human);
    boolean addParents(E human);
}