package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPathsPrint {
    public static void main(String[] args) {
        boolean[][] rec = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[rec.length][rec[0].length];
        pathPrint("",rec,0,0,path,1);
    }
    static void pathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p + " ");
            System.out.println();
            return;


        }
        if (!maze[r][c]) {
            return;
        }
        path[r][c] = step;
        maze[r][c] = false;
        if (r < maze.length - 1) {
            pathPrint(p + 'D', maze, r + 1, c,path,step+1);

        }
        if (c < maze[0].length - 1) {
            pathPrint(p + 'R', maze, r, c + 1,path,step+1);

        }
        if(r > 0){
            pathPrint(p+'U',maze,r-1,c,path,step+1);

        }
        if(c > 0){
            pathPrint(p+'L',maze,r,c-1,path,step+1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
