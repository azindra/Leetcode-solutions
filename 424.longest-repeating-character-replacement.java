/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left =0;
        int maxcount=0;
        int maxLength=0;
        for(int right =0;right<s.length();right++){
            char ch = s.charAt(right);
            freq[ch-'A']++;
        
        maxcount=Math.max(maxcount,freq[ch-'A']);
        int windowsize=right-left+1;
        if(windowsize-maxcount>k){
            freq[s.charAt(left)-'A']--;
            left++;
        }
maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
// @lc code=end

