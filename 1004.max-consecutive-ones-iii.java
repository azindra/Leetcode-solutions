/*
 * @lc app=leetcode id=1004 lang=java
 *
 * [1004] Max Consecutive Ones III
 */

// @lc code=start
class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeros =0;
        int Maxlength=0;
        int left=0;
        for(int right =0;right<nums.length;right++){
            if(nums[right]==0){
                zeros++;
            }
            while (zeros>k) {
                if(nums[left]==0){
                    zeros--;
                }
                left++;
                
            }
            Maxlength=Math.max(Maxlength, right-left+1);
        }
        return Maxlength;
        
    }
}
// @lc code=end

