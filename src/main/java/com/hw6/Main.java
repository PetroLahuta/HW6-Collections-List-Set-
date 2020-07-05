package main.java.com.hw6;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        removeDivisibleNambers(list);

        List<String> fruits = new ArrayList<>();
        fruits.add("Peach");
        fruits.add("Melon");
        fruits.add("Coconut");
        fruits.add("Lemon");
        fruits.add("Orange");

        replaceValue(fruits);

        checkSimilarElements();

        sortElementsByDescend();
    }

    private static void removeDivisibleNambers(List<Integer> list) {
        list.removeIf(i -> i % 3 == 0);
        System.out.println("No numbers divisible by 3: " + list);
    }

    private static void replaceValue(List<String> fruits) {
        int i = fruits.indexOf("Orange");
        if (i >= 0) {
            fruits.set(i, "Grapefruit");
        } else
            System.out.println("Value not present");

        System.out.println("Fruits: " + fruits);
    }

    private static void checkSimilarElements() {
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

    private static void sortElementsByDescend() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(121);
        treeSet.add(45);
        treeSet.add(38);
        treeSet.add(99);
        treeSet.add(40);
        System.out.println("Sort descending: " + treeSet.descendingSet());
    }
}