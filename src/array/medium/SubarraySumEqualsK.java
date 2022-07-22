package array.medium;

//https://leetcode.com/problems/subarray-sum-equals-k/

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        int target = 3;
        System.out.println(subarraySum(arr,target));
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
