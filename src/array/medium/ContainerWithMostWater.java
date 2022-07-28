package array.medium;

import java.util.Arrays;

//https://leetcode.com/problems/container-with-most-water/

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length-1;
        int area;
        while(left<=right){
            area = (right-left)*Math.min(height[right],height[left]);
            res = Math.max(res,area);
            if(height[left] < height[right]){
                left += 1;
            }
            else if(height[left] > height[right]){
                right -= 1;
            }
            else{
                right -= 1;
            }

        }
        return res;
    }
}
