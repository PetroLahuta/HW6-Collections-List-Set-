package main.java.com.hw6.collections;

import java.util.ArrayList;
import java.util.List;

public class ElemetsReplacing {
    List<Integer> createFirstList() {
        List<Integer> first = new ArrayList<>();
        first.add(3);
        first.add(5);
        first.add(7);
        first.add(12);
        return first;
    }

    List<Integer> createSecondList() {
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(7);
        second.add(12);
        second.add(21);
        return second;
    }

    public void checkSimilarElements(List<Integer> first, List<Integer> second) {
        first.retainAll(second);
        System.out.println("Similar elements: " + first);
    }
}
