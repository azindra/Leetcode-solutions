/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        int i =0;
        long result =0;
        int n = s.length();
        int sign =1;
        //space
        while( i<n &&  s.charAt(i)==' '){
            i++;
        }
        //sign
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+' )){
            if(s.charAt(i)=='-')sign=-1;
                  
            
            i++;
        }
        //covert digit
        while(i<n && Character.isDigit(s.charAt(i))) {
            int digit=s.charAt(i)-'0';
            result=result*10+digit;
            
            
        
        //overflow
        if(  sign ==1 && result>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        if(sign==-1 && -result<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        i++;}
        return (int)(sign*result);
        
    }
}
// @lc code=end

