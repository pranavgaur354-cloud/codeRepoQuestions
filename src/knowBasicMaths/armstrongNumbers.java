package knowBasicMaths;

public class armstrongNumbers {
    private static int intpow(int base, int exponent) {
        int ans = 1;
        for (int i = 0; i < exponent; i++) {
            ans *= base;
        }
        return ans;

    }

    public static boolean getArmstrong(int n) {
        int ans = 0;
        int digits = n;
        int power = 0;
        while (digits > 0) {
            power++;
            digits = digits / 10;

        }
        digits = n;
        while (digits > 0) {
            ans = ans + intpow((digits % 10), power);
            digits = digits / 10;
        }

        return ans == n;
    }

}
