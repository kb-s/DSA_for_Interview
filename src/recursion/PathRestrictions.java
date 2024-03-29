package recursion;

public class PathRestrictions {
    public static void main(String[] args) {
        boolean[][] rec = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestrictions("",rec,0,0);
    }
    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;

        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathRestrictions(p + 'D', maze, r + 1, c);

        }
        if (c < maze[0].length - 1) {
            pathRestrictions(p + 'R', maze, r, c + 1);

        }
        if(r > 0){
            pathRestrictions(p+'U',maze,r-1,c);

        }
        if(c > 0){
            pathRestrictions(p+'L',maze,r,c-1);
        }
    }
}
