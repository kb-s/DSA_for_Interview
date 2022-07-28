package array.medium;

import java.util.Arrays;

//https://leetcode.com/problems/rotate-image/

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateImage rotateImage = new RotateImage();
        rotateImage.rotate(matrix);
        System.out.println(Arrays.toString(matrix));
    }
    public void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
        while (left<right){
            for (int i = 0; i < right-left; i++) {
                int top = left, bottom = right;
                int topleft = matrix[top][left + i ];

                matrix[top][left + i] = matrix[bottom - i][left];

                matrix[bottom - i][left] = matrix[bottom][right - i];

                matrix[bottom][right - i] = matrix[top + i][right];

                matrix[top + i][right] = topleft;

            }
            left += 1;
            right -= 1;
        }
    }
}
