package knowBasicRecursion;

public class printN {
    public static void printAllN( int n ){
        if(n==0){
            System.out.println(n);
        }
        printAllN(n-1);
        System.out.println(n);

    }
}
