package main.java.com.hw6.collections;

import java.util.TreeSet;

public class ElementsSorting {
    public void sortElementsByDescend() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(121);
        treeSet.add(45);
        treeSet.add(38);
        treeSet.add(99);
        treeSet.add(40);
        System.out.println("Sort descending: " + treeSet.descendingSet());
    }
}
