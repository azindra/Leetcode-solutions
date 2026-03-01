/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    //sorting as no duplictes needed
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    backtrack(0,candidates,target,new ArrayList<>(),result);
    return result;
        
    }
    private void backtrack(int start,int[] candidates,int target,List<Integer> temp,List<List<Integer>> result){
        //base case
        if(target==0){
            result.add(new ArrayList<>(temp));
        }
        for(int i =start;i<candidates.length;i++){
            //skip duplicates
            if(i>start && candidates[i]==candidates[i-1])continue;
            if(candidates[i]>target) break;
           temp.add(candidates[i]);//choose
           backtrack(i+1,candidates,target-candidates[i],temp,result);//recussion
           temp.remove(temp.size()-1);//backtrack


            
        }
    }

    
}
// @lc code=end

