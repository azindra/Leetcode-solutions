/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //no duplicates 1)sort arry....all subsets..2)backtrcking
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),result);
        return result;
        
    }
    private void backtrack(int start,int[] nums,List<Integer> temp,List<List<Integer>> result){
        result.add(new ArrayList<>(temp));
        for(int i =start;i<nums.length;i++){
            //skip duplicates
            if(i>start && nums[i]==nums[i-1]) continue;
            temp.add(nums[i]);
            backtrack(i+1, nums, temp, result);//recursive
            temp.remove(temp.size()-1);//backtrack
        }
        
    }
}
// @lc code=end

