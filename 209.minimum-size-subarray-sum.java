/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int minlen=Integer.MAX_VALUE;
        int sum =0;
        for(int right =0;right<nums.length;right++){
             sum +=nums[right];
             //window sliding
             while(sum>=target){
                minlen=Math.min(minlen,right-left+1);
                sum-=nums[left];
                left++;
             }

        }
        return minlen==Integer.MAX_VALUE ? 0 :minlen;
        
    }
}
// @lc code=end

