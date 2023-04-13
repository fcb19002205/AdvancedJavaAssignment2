package zadatak;

import java.util.ArrayList;

public class GenericList<T> {

    private ArrayList<T> list;


    public GenericList() {
        list = new ArrayList<T>();
    }

    public void add(T item) {
        list.add(item);
    }

    public T get(int index) {
        return list.get(index);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

}
