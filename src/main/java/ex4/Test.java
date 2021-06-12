package ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        try {
            List<String> list1 = new ArrayList<>();
            list1.add("a");
            list1.add("b");
            list1.add("c");
            list1.add("d");
            System.out.println(list1);
        } catch (Exception e) {
            System.out.println("Unsupported operation exception #1");
        }

        try {
            List<String> list2 = Arrays.asList("a", "b", "c");
            list2.set(1, "d");
            list2.add("f");
            System.out.println(list2);
        } catch (Exception e) {
            System.out.println("Unsupported operation exception #2");
        }

        try {
            List<String> list1 = new ArrayList<>();
            list1.add("a");
            List<String> lis3 = Collections.unmodifiableList(list1);
            list1.add("d");
            System.out.println(lis3);
        } catch (Exception e) {
            System.out.println("Unsupported operation exception #3");
        }

        // In JDK 9:
        try {
            List<String> list4 = List.of("a", "b", "c");
            list4.remove("d");
            System.out.println(list4);
        } catch (Exception e) {
            System.out.println("Unsupported operation exception #4");
        }

    }
}

