/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for(int i = 0; i < nums.length; i++){

            if(i > maxReach)
                return false;

            maxReach = Math.max(maxReach, i + nums[i]);

        }

        return true;
    }
}
// @lc code=end

