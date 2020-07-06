package main.java.com.hw6.collections;

import java.util.ArrayList;
import java.util.List;

public class ElemetsReplacing {
    public void checkSimilarElements() {
        List<Integer> first = new ArrayList<>();
        first.add(3);
        first.add(5);
        first.add(7);
        first.add(12);

        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(7);
        second.add(12);
        second.add(21);

        first.retainAll(second);
        System.out.println("Similar elements: " + first);
    }
}
