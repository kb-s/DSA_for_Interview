public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 6;

        System.out.println(fib(n));
    }
    public static int fib(int n) {

        if(n < 2){
            return n;
        }
        int cur = 1;
        int prev = 0;
        for (int i = 1; i < n; i++) {
            cur += prev;
            prev = cur - prev;
        }
        return cur;
    }
}
