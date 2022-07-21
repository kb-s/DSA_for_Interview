package array.easy;

// this is the one easy interesting problem which i find on leetcode
//https://leetcode.com/problems/find-pivot-index/

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int i: nums){
            totalSum += i;
        }
        int sumL = 0;
        for (int i = 0; i < nums.length; i++) {
            int sumR = totalSum-nums[i]-sumL;
            if(sumL == sumR){
                return i;
            }
            sumL += nums[i];
        }

        return -1;
    }
}
