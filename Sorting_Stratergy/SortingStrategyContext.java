package Sorting_Stratergy;

import java.util.ArrayList;
import java.util.List;

class SortingStretagy {
    private SortingStrategy strategy; // Current sorting strategy
    private List<String> items = new ArrayList<>(); // List of items to sort

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy; // Dynamically set strategy
    }

    public void addItem(String item) {
        items.add(item); // Add new item to list
    }

    public void removeItem(String item) {
        items.remove(item); // Remove item from list
    }

    public void performSort() {
        if (strategy != null) {
            strategy.sort(items); // Delegate sorting to chosen strategy
        } else {
            System.out.println("No strategy set!");
        }
    }

    public List<String> getList() {
        return items; // Return sorted (or unsorted) list
    }
}
