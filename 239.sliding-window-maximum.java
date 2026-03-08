/*
 * @lc app=leetcode id=239 lang=java
 *
 * [239] Sliding Window Maximum
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int [] result = new int [n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();
        //remove index outside window
        int index =0;
        for(int i =0;i<n;i++){
        if(!dq.isEmpty() && dq .peekFirst()==i-k) 
            dq.pollFirst();
        //remove small values
        while (!dq.isEmpty() && nums[dq.peekLast()]<nums[i]) {
            dq.pollLast();
            
        }
        //add current index
        dq.addLast(i);
        //max
        if(i>=k-1){
            result[index++]=nums[dq.peekFirst()];
        }

        
    }
return result;
}
}
// @lc code=end

