package knowBasicMaths;

import java.util.ArrayList;
import java.util.List;

public class divisors {
    //    public static List<Integer> getDivisors(int N){
//        List<Integer> ans =new ArrayList<>();
//        for (int i = 1; i <=N; i++) {
//            if(N%i==0){
//                ans.add(i);
//
//            }
//
//        }
//        return ans;
//    }
    public static List<Integer> getDivisorsFast(int N) {
        int i=1;
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        while (i * i <= N) {
            if (N % i == 0) {
                small.add(i);
                if(N/i!=i){
                    large.add(N/i);
                }
            }
            i++;

        }
        for (int j = large.size()-1; j >= 0; j--) {

            small.add(large.get(j));

        }
        return small;
    }
}
