package array.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        res[0] = 1;
        int product = 1;

        for (int i = 1; i < nums.length; i++) {
            product = product * nums[i - 1];
            res[i] = product;
        }
        product = 1;

        for (int i = res.length - 2; i >= 0; i--) {
            product = product * nums[i + 1];
            res[i] = res[i] * product;
        }
        return res;
    }
}
