/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int current = 0;
        int count =0;
        for(int num :nums){
            if(count==0){
                current=num;
            }
            if(num==current){
                count++;
            }
            else{
                count--;
            }
        }
        return current;
        
    }
}
// @lc code=end

