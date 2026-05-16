package knowBasicHashing;

import java.util.HashMap;
import java.util.Map;

public class Count {
    public static Map<Integer, Integer> countElementsInArray(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int x : arr) {
            counts.merge(x, 1, Integer::sum);
        }
        return counts;
    }
}
