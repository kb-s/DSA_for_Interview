package recursion.array;

import java.util.ArrayList;

public class findAllindex {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,6,45,4};
        int target = 4;
        findIndex(arr,target,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();

    static void findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }

        findIndex(arr,target,index+1);

    }

}
