package ex4;

import java.math.BigDecimal;
import java.util.*;

public class JavaCollections {
    private void collectionsExample() {
        //In JDK 8:
        Map<String, Integer> modifiableMap = new HashMap<>() {{put("a", 1);}};
        modifiableMap.put("c", 3);
        modifiableMap.put("d", 4);
        Map<String, Integer> unmodifiableMap1 = Collections.unmodifiableMap(modifiableMap);
        //In JDK 9:
        Map<String, Integer> unmodifiableMap2 = Map.of("a", 1, "b", 2, "c", 3);

        //In JDK 8:
        List<String> modifiableList = Arrays.asList("a", "b", "c");
        List<String> unmodifiableList1 = Collections.unmodifiableList(modifiableList);
        // In JDK 9:
        List<String> unmodifiableList2 = List.of("a", "b", "c");

        //In JDK 8:
        Set<String> modifiableSet = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> unmodifiableSet1 = Collections.unmodifiableSet(modifiableSet);
        //In JDK 9:
        Set<String> unmodifiableSet2 = Set.of("a", "b", "c");
    }
}
