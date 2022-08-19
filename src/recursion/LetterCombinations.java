package recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
    public static List<String> letterCombinations(String digits) {

        return helper("", digits);
    }
    static ArrayList<String> helper(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0)-'0';
        for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
            char ch = (char)('a'+i);
            ans.addAll(helper(p+ch,up.substring(1)));
        }
        return ans;
    }
}
