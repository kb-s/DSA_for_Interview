package recursion.string;

import java.util.ArrayList;

public class SubSeqList {
    public static void main(String[] args) {
        System.out.println(subseqlist("","abc"));
    }
    static ArrayList<String> subseqlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqlist(p+ch,up.substring(1));
        ArrayList<String> right = subseqlist(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
