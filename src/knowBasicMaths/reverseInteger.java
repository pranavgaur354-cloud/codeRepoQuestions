package knowBasicMaths;

import java.util.Scanner;

public class reverseInteger {
    public static void main() {

        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int ans =0;
        do{
            ans = ans*10 + n%10;
            n= n / 10;
        } while( n > 0 );
        System.out.println(ans);
    }

}
