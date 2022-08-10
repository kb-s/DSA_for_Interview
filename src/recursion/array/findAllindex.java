package recursion.array;

import java.util.ArrayList;

public class findAllindex {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,6,45,4};
        int target = 4;
        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.println(findIndex2(arr,target,0,list1));
        System.out.println(findIndex3(arr,target,0));
        //System.out.println(list);
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
    //We can solve this without using void means we can  solve this by using ArrayList or something else
    //it will reduce the space
    static ArrayList findIndex2(int[] arr, int target, int index, ArrayList<Integer> list1){
        if(index == arr.length){
            return list1;
        }
        if(arr[index]==target){
            list1.add(index);
        }

        return findIndex2(arr,target,index+1,list1);

    }

    //this method will create the object again & again , it is not a opmized way but some problem may use it
    static ArrayList findIndex3(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findIndex3(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);

        return list;
    }


    }
