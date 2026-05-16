package knowBasicRecursion;

public class ArrayReversal {
    public static int[] reverseArray(int[] n){

        return swap(n,0, n.length -1);
    }

    private static int[] swap(int[ ] n, int left , int right){
        if(left>= right){
            return n;

        }
        int sw = n[right];
        n[right]=n[left];
        n[left]=sw;
        return swap(n, left+1,right - 1);

    }
}
