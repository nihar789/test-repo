package Sorting_Stratergy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LengthSort implements SortingStrategy {
    @Override
    public void sort(List<String> items) {
        // Sorting based on length of string
        Collections.sort(items, (a, b) -> Integer.compare(a.length(), b.length()));
    }
}

