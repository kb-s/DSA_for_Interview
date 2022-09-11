package leetcodehard;

import java.util.ArrayList;
import java.util.List;

public class GetPermutation {
    public static String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> number = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact *= i;
            number.add(i);

        }
        number.add(n);
        String ans = "";
        k -= 1;
        while (true){
            ans += number.get(k/fact);
            number.remove(k/fact);
            if(number.size() == 0){
                break;
            }
            k = k%fact;
            fact = fact/number.size();
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3, k = 3;
        getPermutation(n,k);
    }
}
