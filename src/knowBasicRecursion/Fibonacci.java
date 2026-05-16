package knowBasicRecursion;

import java.util.ArrayList;
import java.util.List;


public class Fibonacci {

        public static List<Integer> fibUpToN(int n){
            List<Integer> result = new ArrayList<>();

            // Handle the smallest cases first — they don't need the loop
            if (n < 0) return result;        // empty list for negative
            result.add(0);                   // term 0
            if (n == 0) return result;       // [0]
            result.add(1);                   // term 1
            if (n == 1) return result;       // [0, 1]

            // Now we have at least [0, 1]. Loop to build the rest.
            for (int i = 2; i <= n; i++) {
                int prev = result.get(i - 1);   // the term we just added
                int prev2 = result.get(i - 2);   // the one before that
                int next = prev + prev2;
                result.add(next);
            }
            return result;
        }
}
