package recursion;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        //permutations("","abc");
        ArrayList<String> ans = permutationsRet("","abc");
        System.out.println(ans);
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1));

        }
    }
    static ArrayList<String> permutationsRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(permutationsRet(f+ch+s,up.substring(1)));

        }
        return ans;
    }
}

