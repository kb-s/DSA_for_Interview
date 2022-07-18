package array.easy;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

//this is the leetcode easy problem
//if you are new to stock market then this problem will help you :)

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int max = 0, cur = 0;
        for (int i = 1; i < prices.length; i++) {
            cur = Math.max(0, cur += prices[i] - prices[i-1]);
            max = Math.max(cur,max);
        }
        return max;
    }
}
