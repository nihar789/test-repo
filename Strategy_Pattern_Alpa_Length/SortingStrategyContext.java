package Strategy_Pattern_Alpa_Length;

import java.util.ArrayList;
import java.util.List;

public class SortingStrategyContext {
    private List<String> items;
    private SortingStrategy sortingStrategy;

    public SortingStrategyContext() {
        this.items = new ArrayList<>();
    }

    public void setStrategyForSorting(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void addItems(String... items) {
        for (String item : items) {
            this.items.add(item);
        }
    }

    public void performSort() {
        if (sortingStrategy == null) {
            throw new RuntimeException("Sorting strategy not set");
        }
        List<String> sortedItems = sortingStrategy.sort(items);
        System.out.println(sortedItems);
    }

    public static void main(String[] args) {
        SortingStrategyContext context = new SortingStrategyContext();
        context.addItems("Stanford", "Ankit", "Watson", "Done");

        System.out.println("Alpha sorting:");
        context.setStrategyForSorting(new AlphabeticalSort());
        context.performSort();

        System.out.println("Lengthwise sorting:");
        context.setStrategyForSorting(new LengthSort());
        context.performSort();
    }
}

