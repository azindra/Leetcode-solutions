/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */

// @lc code=start
class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int [128];
        for(char c : t.toCharArray()){
            freq[c]++;

        }
        int left =0;
        int right =0;
        int start =0;
        int minlen = Integer.MAX_VALUE;
        int need = t.length();
        while(right<s.length()){
            char r = s.charAt(right);
            if(freq[r]>0) need--;
            freq[r]--;
            right++;
        
       while(need==0){
        if(right-left<minlen){
            minlen=right-left;
            start=left;
        }
    
       
       char l = s.charAt(left);
       freq[l]++;
       if(freq[l]>0) need++;
       left++;
        
    }
}
return minlen==Integer.MAX_VALUE ? "": s.substring(start, start+minlen);
}}
// @lc code=end

