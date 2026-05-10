package knowBasicMaths;
import java.util.Scanner;
public class countingNumbers {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        n = Math.abs(n);
        int ans =0;
        do{
            n= n / 10;
            ans = ans + 1;
        }while( n > 0 );
        System.out.println(ans);
    }

}
