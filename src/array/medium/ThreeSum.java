package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n<3){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);                  //now my array is sorted which is {-4,-1,-1,0,1,2}
        for (int i = 0; i < n-2; i++) {         //i=0
            if(i == 0 || nums[i] != nums[i-1]){         //-4 !=
                int j = i+1, k = n-1;
                while (j<k){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum == 0) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) j++;
                        while (j < k && nums[k] == nums[k - 1]) k--;
                        j++;
                        k--;
                    }
                    else if(sum>0) k--;
                    else j++;
                }
            }
        }
        return res;
    }
}
