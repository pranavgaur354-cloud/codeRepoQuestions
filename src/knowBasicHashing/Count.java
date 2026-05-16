package knowBasicHashing;

import java.util.HashMap;
import java.util.Map;

public class Count {
    public static Map<Integer, Integer> countElementsInArray(int[] n) {
        Map<Integer, Integer> arr = new HashMap<>();
        for (int j : n) {
            arr.merge(j, 1, Integer::sum);
        }
        return arr;
    }
}
