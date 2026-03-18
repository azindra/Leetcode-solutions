/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int maxprice=0;
        int minprice=Integer.MAX_VALUE;
        for(int i =0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
                if(profit>maxprice){
                    maxprice=profit;
                }
            }
        }
       return maxprice; 
    }
}
// @lc code=end

