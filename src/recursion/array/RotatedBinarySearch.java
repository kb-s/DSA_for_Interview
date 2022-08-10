package recursion.array;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 8 ;
        int s=0;
        int e = arr.length;
        System.out.println(rbs(arr,target,s,e));
    }
    static int rbs(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(target == arr[m]){
            return m;
        }
        if(arr[m] >= arr[s]){
            if(target >= arr[s] && target <= arr[m]){
                return rbs(arr,target,s,m-1);
            }
            else{
                return rbs(arr,target,m+1,e);
            }
        }
        if(target <= arr[e] && target >= arr[m]){
            return rbs(arr,target,m+1,e);
        }
        else {
            return rbs(arr,target,s,m-1);
        }
    }

}
