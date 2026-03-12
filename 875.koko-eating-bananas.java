/*
 * @lc app=leetcode id=875 lang=java
 *
 * [875] Koko Eating Bananas
 */

// @lc code=start
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1;
        int right =0;
        for(int p :piles){
            right= Math.max(right, p);
        }
        while(left<right){
            int mid = left+(right-left)/2;
            int hour=0;
            for(int pile:piles){
                hour+=(pile+mid-1)/mid;

            }
            if(hour>h){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left;
        
    }
}
// @lc code=end

