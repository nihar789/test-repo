import java.util.*;

public class Day18_Task19 {
    public static void main(String[] args) {
        int[] arr = {45, 81, 85, 100, 20, 95, 60, 10, 21};

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int num : arr) {
            int unitDigit = num % 10;
            map.computeIfAbsent(unitDigit, k -> new ArrayList<>()).add(num);
        }

        int groupIndex = 1;
        for (List<Integer> group : map.values()) {
            System.out.println("Array " + groupIndex + " has: " + group);
            groupIndex++;
        }
    }
}
