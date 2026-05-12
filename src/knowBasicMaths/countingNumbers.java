package knowBasicMaths;
import java.util.Scanner;
public class countingNumbers {

    public static int countDigits(int x){
        int n = Math.abs(x);
        int ans =0;
        do{
            n= n / 10;
            ans = ans + 1;
        }while( n > 0 );
        return ans;
    }
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        System.out.println(countDigits(n));
    }


}
