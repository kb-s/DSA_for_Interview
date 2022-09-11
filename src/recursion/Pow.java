package recursion;

public class Pow {
    public double myPow(double x, int n) {
        if(n<0)
            return 1/myPow(x, -n);

        if(n==0)
            return 1;

        if(n%2==1)
            return x*myPow(x,n-1);

        if(n%2==0)
            return myPow(x*x,n/2);

        return 0;
    }

    public static void main(String[] args) {
        Pow pow = new Pow();
        System.out.println(pow.myPow(2,-2));
    }
}
