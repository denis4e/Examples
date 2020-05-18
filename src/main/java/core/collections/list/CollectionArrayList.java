package core.collections.list;

import java.util.*;

public class CollectionArrayList {

    public static void main(String[] args) {
        Random generator = new Random();
        ArrayList<Integer> j7list = new ArrayList<>();
        System.out.println("------Java 7 Init and Sorting with new ArrayList<Integer> ------");
        for (int i = 0; i < 10; i++) {
            j7list.add(i + 1 * generator.nextInt());
        }
        System.out.println("------ArrayList before sorting ------");
        for (Integer item : j7list) {
            System.out.println("item:" + item);
        }
        Comparator<Integer> j7comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : (o1 < o2) ? 1 : 0;
            }
        };
        Collections.sort(j7list, j7comp);
        System.out.println("------ArrayList after sorting ------");
        for (Integer item : j7list) {
            System.out.println("item:" + item);
        }

        System.out.println("------Java 8 Init and Sorting with new ArrayList<Integer> ------");
        List<Integer> j8list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            j8list.add(i + 1 * generator.nextInt());
        }
        System.out.println("------ArrayList before sorting ------");
        j8list.forEach(System.out::println);
        j8list.sort((o1, o2) -> o1 > o2 ? -1 : (o1 < o2) ? 1 : 0);
        System.out.println("------ArrayList after sorting ------");
        j8list.forEach(System.out::println);

    }
}
