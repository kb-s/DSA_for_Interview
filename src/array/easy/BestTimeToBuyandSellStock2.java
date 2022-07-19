package array.easy;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
//this is again a probelm for stock market lover:)

public class BestTimeToBuyandSellStock2 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices){
        int sum =0;
        for (int i = 1; i < prices.length; i++) {
            sum += Math.max(0,prices[i]-prices[i-1]);
        }
        return sum;
    }
}
