package main.java.com.hw6;

import main.java.com.hw6.collections.ElementsSorting;
import main.java.com.hw6.collections.ElemetsReplacing;
import main.java.com.hw6.collections.FruitReplacing;
import main.java.com.hw6.collections.RemoveDivisibleByThree;

public class Main {
    public static void main(String[] args) {
        RemoveDivisibleByThree removeDivisibleByThree = new RemoveDivisibleByThree();
        removeDivisibleByThree.removeDivisibleNambers();

        FruitReplacing fruitReplacing = new FruitReplacing();
        fruitReplacing.replaceValue();

        ElemetsReplacing elemetsReplacing = new ElemetsReplacing();
        elemetsReplacing.checkSimilarElements();

        ElementsSorting elementsSorting = new ElementsSorting();
        elementsSorting.sortElementsByDescend();
    }
}