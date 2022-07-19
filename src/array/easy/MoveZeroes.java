package array.easy;

// this program will not run now coz main method is not written here
// you can write this code in main method, so that you can see the output of this code

//https://leetcode.com/problems/move-zeroes/

public class MoveZeroes {
        public void moveZeroes(int[] nums) {
            int i=0,j=0;
            while(j<nums.length){
                if(nums[j] != 0){
                    nums[i++] = nums[j];
                }

                j++;
            }

            while(i<nums.length){
                nums[i++] = 0;
            }
        }

}
