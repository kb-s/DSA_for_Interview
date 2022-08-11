package mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,6,4,9,3,12};
         arr = mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mixarr = new int[first.length+second.length];
        int i=0,j=0,k=0;
        while (i<first.length && j< second.length){
            if(first[i]<second[j]){
                mixarr[k] = first[i];
                i++;
            }
            else{
                mixarr[k] = second[j];
                j++;

            }
            k++;
        }
        while (i< first.length){
            mixarr[k] = first[i];
            i++;
            k++;
        }
        while (j< second.length){
            mixarr[k] = second[j];
            j++;
            k++;
        }
        return mixarr;
    }
}
