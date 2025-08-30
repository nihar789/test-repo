package Strategy_Pattern_Alpa_Length;
import java.util.*;
import java.util.stream.Collectors;

class LengthSort implements SortingStrategy {
    @Override
    public List<String> sort(List<String> items) {
        return items.stream()
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .collect(Collectors.toList());
    }
}
