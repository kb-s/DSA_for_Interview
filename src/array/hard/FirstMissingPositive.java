package array.hard;

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {5,1,-1,2,4};
        System.out.println(firstMissingPositive(arr));

    }
    public static int firstMissingPositive(int[] arr) {
        int i=0;
        while (i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct] ){     //3 != -1
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index+1){
                return index+1;
            }
        }
        return arr.length+1;
    }
    public static void swap(int[] arr, int first,int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
