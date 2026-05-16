package knowBasicRecursion;

import net.sf.saxon.functions.ConstantFunction;

public class StringPalindrome {
    public static boolean isPalindrome(String s) {

        return indexCheckRecursive(s, 0, s.length() - 1);
    }

    private static boolean indexCheckRecursive(String s, int left, int right) {
        if (left >= right) {
            return true;

        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return indexCheckRecursive(s, left + 1, right - 1);

    }
}
