package array.medium;
import java.util.Arrays;

//https://leetcode.com/problems/next-permutation/

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length <=1)return;

        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        if(i >= 0){
            int j = nums.length-1;
            while(nums[j] <= nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverse(int[] arr, int i, int j){
        while (i<j) swap(arr,i++,j--);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        NextPermutation nextpermutation = new NextPermutation();

        nextpermutation.nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
