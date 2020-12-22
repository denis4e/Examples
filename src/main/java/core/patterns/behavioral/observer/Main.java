
package core.patterns.behavioral.observer;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        run(Arrays.asList("test", 1, "empty"));
    }

    static <T> void run(List<? extends T> list) {
        for (T item : list) {
            System.out.println(item.toString());
        }
    }
}
