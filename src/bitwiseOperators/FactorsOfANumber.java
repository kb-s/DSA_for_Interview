package bitwiseOperators;

import java.util.ArrayList;

public class FactorsOfANumber {
    public static void main(String[] args) {
        int n = 36;
        factors(n);
    }

    // take some extra space coz of the order, if you don't want to print this in order then no need to take
    //extra space.
    static void factors(int n){
        ArrayList<Integer> arrayList = new ArrayList();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i+" ");
                    arrayList.add(n/i);
                }

            }

        }
        for (int i = arrayList.size()-1; i >=0; i--) {
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
