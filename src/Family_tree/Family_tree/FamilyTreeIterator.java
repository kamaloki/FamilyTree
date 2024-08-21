package Family_tree.Family_tree;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator<E> implements Iterator<E> {
    private List<E> list;
    private int index;

    public FamilyTreeIterator(List<E> list){
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return  index < list.size();
    }

    @Override
    public E next() {
        return list.get(index++);
    }
}
