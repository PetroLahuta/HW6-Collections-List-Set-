package main.java.com.hw6.collections;

public class Executor {
    protected static void implementCollections() {
        RemovingDivisible removingDivisible = new RemovingDivisible();
        removingDivisible.removeDivisibleNambers(removingDivisible.createList());

        FruitReplacing fruitReplacing = new FruitReplacing();
        fruitReplacing.replaceValue(fruitReplacing.createList());

        ElemetsReplacing elemetsReplacing = new ElemetsReplacing();
        elemetsReplacing.checkSimilarElements(elemetsReplacing.createFirstList(), elemetsReplacing.createSecondList());

        ElementsSorting elementsSorting = new ElementsSorting();
        elementsSorting.sortElementsByDescend(elementsSorting.createSet());
    }
}
