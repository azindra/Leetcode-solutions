/*
 * @lc app=leetcode id=84 lang=java
 *
 * [84] Largest Rectangle in Histogram
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        for(int i=0;i<=heights.length;i++){
            int h = (i==heights.length)? 0:heights[i];
            while(!stack.isEmpty() && h<heights[stack.peek()]){
                int height= heights[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width=i;
                }                else{
                    width=i-stack.peek()-1;
                }
            maxarea=Math.max(maxarea, height*width);

            }
            stack.push(i);
        }
        return maxarea;
        
    }
}
// @lc code=end

