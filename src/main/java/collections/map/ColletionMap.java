package collections.map;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ColletionMap {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Willis");
        map.put(2, "Schwarzenegger");
        map.put(3, "Chan");
        map.put(4, "Stallone");
        map.put(5, "Norris");
        map.put(6, "Chan");
        map.put(7, "Stallone");
        System.out.println("Init map with values:");
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Index : " + entry.getKey() + " Surname : " + entry.getValue());
        }
        System.out.println("Filtered:");
        Map<Integer, String> result = map.entrySet().stream()
                .filter(mapEntry -> "Chan".equals(mapEntry.getValue()) || "Stallone".equals(mapEntry.getValue()))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        result.forEach((k, v) -> System.out.println("Index - " + k + " " + "Item - " + v));
    }
}