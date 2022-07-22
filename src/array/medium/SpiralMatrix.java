package array.medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(arr));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int m = matrix.length-1;
        int n = matrix[0].length-1;

        int start_row = 0,end_row =m, start_col = 0,end_col = n;

        while(start_row <= end_row && start_col <= end_col){
            for (int i = start_col; i <= end_col; i++) {
                res.add(matrix[start_row][i]);
            }
            start_row++;
            for (int i = start_row; i <= end_row; i++) {
                res.add(matrix[i][end_col]);
            }
            end_col--;

            if(start_row <= end_row){
                for(int i = end_col; i >= start_col; i--){
                    res.add(matrix[end_row][i]);
                }
            }
            end_row--;
            if(start_col <= end_col){
                for(int i =end_row; i >= start_row ; i--){
                    res.add(matrix[i][start_col]);
                }
            }
            start_col++;
        }
        return res;

    }
}
