/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result= new ArrayList<>();
        if(digits==null || digits.length()==0){
            return result;
        
        } 
        String[] map ={
            "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        backtrack(0,digits,new StringBuilder(),result,map);
        return result;
        
    }
    private void backtrack(int index,String digits,StringBuilder current,List<String> result,String [] map){
        //base cse
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }
        String letters =map[digits.charAt(index)-'0'];
        for(char ch : letters.toCharArray()){
            current.append(ch);
            backtrack(index+1, digits, current, result, map);
            current.deleteCharAt(current.length()-1);
        }
    }
}
// @lc code=end

