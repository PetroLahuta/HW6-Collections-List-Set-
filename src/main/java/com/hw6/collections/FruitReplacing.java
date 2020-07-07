package main.java.com.hw6.collections;

import java.util.ArrayList;
import java.util.List;

public class FruitReplacing {
    List<String> createList() {

        List<String> fruits = new ArrayList<>();
        fruits.add("Peach");
        fruits.add("Melon");
        fruits.add("Coconut");
        fruits.add("Lemon");
        fruits.add("Orange");
        return fruits;
    }

    public void replaceValue(List<String> fruits) {
        int i = fruits.indexOf("Orange");
        if (i >= 0) {
            fruits.set(i, "Grapefruit");
        } else
            System.out.println("Value not present");

        System.out.println("Fruits: " + fruits);
    }
}
