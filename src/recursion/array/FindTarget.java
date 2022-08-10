package recursion.array;

public class FindTarget {
    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,45,67};
        int target = 65;
        System.out.println(findIndex(arr,target,0));

    }
    //this method will give the value true or false means if element is present in this array it will give true
    //otherwise false, if you want to print the index number of target element then go to the findIndex method

    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index]==target || find(arr,target,index+1);

    }

    // this method will give the index number of the element if it is present in the array else return -1
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }

    }

}
