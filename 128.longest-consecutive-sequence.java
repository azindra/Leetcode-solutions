/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int longest =0;
        for(int num: nums){
            set.add(num);
        }
        for(int n : set){
            if(!set.contains(n-1)){
                int currentnum=n;
                int length =1;

                while(set.contains(currentnum+1)){
                    currentnum++;
                    length++;
                }
                longest=Math.max(length, longest);
            }
            
        }

        return longest;
    }
}
// @lc code=end

