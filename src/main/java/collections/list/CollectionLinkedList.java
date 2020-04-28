package collections.list;

import java.util.LinkedList;
import java.util.List;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> list = new LinkedList<Double>();
        list.add(1.23);
        list.add(1, 5.3);
        list.add(2, 10.1);
        list.add(3, 7.7);
        list.add(4, 9.4);
        list.add(5, 2.1);
        System.out.println(list);
        list.remove(2);
        list.remove(2.1);
        System.out.println(list);
        System.out.println("Размер - " + list.size());
    }
}
