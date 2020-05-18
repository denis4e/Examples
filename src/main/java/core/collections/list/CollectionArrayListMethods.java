package core.collections.list;

import java.util.*;

public class CollectionArrayListMethods {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
      /*This is how elements should be added to the array list*/
        list.add("Denis");
        list.add("Ivan");
        list.add("Vlad");
        list.add("Alex");
        list.add("Ajeet");
        list.add("Harry");
        list.add("Chaitanya");
        list.add("Steve");
        list.add("Anuj");
        list.add("Tom");
        /* Displaying array list elements */
        System.out.println("Currently the array list has following elements:" + list);
        /*Add element at the given index*/
        list.add(0, "Rahul");
        list.add(1, "Justin");
        System.out.println("Current array list is:" + list);
         /*Remove element from the given index*/
        list.remove(1);
        System.out.println("Current array list is:" + list);
          /*Remove elements from array list like this*/
        list.remove("Chaitanya");
        System.out.println("Current array list is:" + list);
       /*add(int index, Object o): It adds the object o to the array list at the given index.*/
        list.add(2, "bye");
        System.out.println("Current array list is:" + list);
        /*remove(Object o): Removes the object o from the ArrayList.*/
        list.remove("bye");
        System.out.println("Current array list is:" + list);
        /*set(int index, Object o): Used for updating an element.
         It replaces the element present at the specified index with the object o.
          */
        list.set(2, "Tom");
        System.out.println("Current array list is:" + list);
       /* int indexOf(Object o): Gives the index of the object o.
       If the element is not found in the list then this method returns the value -1.
        */
        int pos = list.indexOf("Tom");
        System.out.println("Current Tom position in list is:" + pos);
        /*Object get(int index): It returns the object of list which is present at the specified index.*/
        String str = list.get(2);
        System.out.println("Current elemetn #2 is:" + str);
       /* boolean contains(Object o): It checks whether the given object o is present in the array
        list if its there then it returns true else it returns false.
         */
        System.out.println("List is contains Steve-"+list.contains("Steve"));
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()==o2.length()){return 0;}
                if (o1.length()<o2.length()){return -1;}
                if (o1.length()>o2.length()){return 1;}
                return 0;
            }
        });
        System.out.println("Current List sorted by length:" + list);
    }
}
