package recursion;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        //phonepad("","12");
        System.out.println(phonepadRet("","12"));

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
    static ArrayList<String> phonepadRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(phonepadRet(p + ch, up.substring(1)));
        }
        return ans;
    }

}
