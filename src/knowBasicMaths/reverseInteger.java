package knowBasicMaths;

import java.util.Scanner;

public class reverseInteger {


    public static int checkReverser(int x){
        int flag=1;
        if (x<0){
            x=Math.abs(x);
            flag=-1;
        }

        int ans =0;
        do{
            ans = ans*10 + x%10;
            x= x / 10;
        } while( x > 0 );


        return ans*flag;
    }
    public static void main() {

        Scanner a = new Scanner(System.in);
        int n = a.nextInt();

        System.out.println(checkReverser(n));
    }

}
