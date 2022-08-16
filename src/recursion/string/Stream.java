package recursion.string;

public class Stream {
    public static void main(String[] args) {
        skipCharacter("","baccadh");
    }
    static void skipCharacter(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skipCharacter(p,up.substring(1));
        }
        else {
            skipCharacter(p+ch,up.substring(1));
        }
    }
}
