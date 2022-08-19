package recursion;

public class PhonePad {
    public static void main(String[] args) {
        phonepad("","12");
    }
    static void phonepad(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char)('a'+i);
            phonepad(p+ch,up.substring(1));
        }
    }
}
