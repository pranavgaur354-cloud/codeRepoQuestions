package knowBasicMaths;

public class checkPrime {
    public static boolean primes(int n) {
        if (n < 2) {
            return false;
        }
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

}
