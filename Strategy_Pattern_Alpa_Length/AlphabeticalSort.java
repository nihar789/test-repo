package Strategy_Pattern_Alpa_Length;
import java.util.*;
import java.util.stream.Collectors;

class AlphabeticalSort implements SortingStrategy {
    @Override
    public List<String> sort(List<String> items) {
        return items.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList());
    }
}
