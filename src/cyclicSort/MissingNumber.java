package cyclicSort;

// also check the array's hard package where you can find the missing Positive number problem
//which is also solved by using the cyclic sort algorithm

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }
            else
                i++;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    public static void swap(int[] arr, int first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
