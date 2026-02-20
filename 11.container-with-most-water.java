/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxwater =0;
        while(left<right){
            int h= Math.min(height[left], height[right]);
            int w = right-left;
            int area = h*w;
            maxwater = Math.max(maxwater,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;

        
    }
}
// @lc code=end

