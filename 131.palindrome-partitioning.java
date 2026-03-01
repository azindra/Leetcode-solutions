/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */

// @lc code=start

import java.util.*;

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0,s,new ArrayList<>(),result);
        return result;
    }
    private void backtrack(int start,String s,List<String> temp,List<List<String>> result){
        if(start==s.length()) {//base condition
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start;i<s.length();i++){
            //check palidrome
            if(isplaindrome(s,start,i)){
                temp.add(s.substring(start, i+1));
                backtrack(i+1, s, temp, result);
                temp.remove(temp.size()-1);
            }
        } }
        private boolean isplaindrome(String s, int l ,int r){
            while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)) return false;}
            return true;

        
    }}

        
    

// @lc code=end

