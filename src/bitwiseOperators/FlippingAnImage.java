package bitwiseOperators;

import java.util.Arrays;

//https://leetcode.com/problems/flipping-an-image/

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(arr)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                int temp = row[i]^1;
                row[i] = row[image.length-i-1]^1;
                row[image.length-i-1]  = temp;
            }
        }
        return image;
    }
}
