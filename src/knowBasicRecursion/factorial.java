package knowBasicRecursion;

public class factorial {
    public static int factorialOfN(int n){
        if (n<=1){
            return 1;
        }
        return n* factorialOfN(n-1);

    }

}
