package binarysearch;

public class Sqrt {
    public static void main(String[] args) {
        int num = 49;
        System.out.println(mySqrt(num));
    }
    static int mySqrt( int n) {
        int start = 0 , end = n , result = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid*mid <= n){
                result = mid;
                start = mid+1;
            }
            else
                end = mid-1;

        }
        return result;
    }
}
