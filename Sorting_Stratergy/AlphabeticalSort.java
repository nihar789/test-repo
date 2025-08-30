package Sorting_Stratergy;

import java.util.Collections;
import java.util.List;

class AlphabeticalSort implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        // Sorting alphabetically ignoring case
        Collections.sort(items, String.CASE_INSENSITIVE_ORDER);
    }
}

