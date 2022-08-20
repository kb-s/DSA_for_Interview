package recursion;

public class IncludeDiaognalPath {
    public static void main(String[] args) {
        diaognalPath("",3,3);
    }
    static void diaognalPath(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;

        }
        if(r > 1 && c > 1 ){
            diaognalPath(p+'D',r-1,c-1);
        }
        if(r>1){
            diaognalPath(p+'V',r-1,c);

        }
        if(c>1){
            diaognalPath(p+'H',r,c-1);
        }
    }

}
