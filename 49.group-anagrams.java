/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map =new HashMap<>();
        for(String word :strs){
            int [] freq = new int [26];
            for(char c : word.toCharArray()){
                freq[c-'a']++;
            }
            StringBuilder key = new StringBuilder();
            for(int count :freq){
                key.append(count).append('#');
            }

            map.putIfAbsent(key.toString(),new ArrayList<>());
            map.get( key.toString()).add(word);

        
    }
    return new ArrayList<>(map.values());
}}
// @lc code=end

