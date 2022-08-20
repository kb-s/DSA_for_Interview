package recursion;

public class Maze {
    public static void main(String[] args) {
        System.out.println(countRoute(3,4));
    }
    static int countRoute(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = countRoute(r-1,c);
        int right = countRoute(c-1,r);

        return left+right;
    }
}
