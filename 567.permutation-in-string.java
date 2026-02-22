/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false ;
        int[] freq = new int[26];
        for( char c :s1.toCharArray()){
            freq[c-'a']++;

        }
        int left =0;
        for(int right=0;right<s2.length();right++){
            char ch = s2.charAt(right);
            freq[ch-'a']--;
            if(right-left+1>s1.length()){
                freq[s2.charAt(left)-'a']++;
                left++;

            }
            if(allzro(freq)) return true;

        }
        return false;
    }
        private boolean allzro(int[] arr){
            for(int n:arr){
                if(n!=0){
                    return false;
                }
               

            }
            return true;
        }
    
            

        }
        
    

// @lc code=end

