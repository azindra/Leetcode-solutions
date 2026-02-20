/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length-1;
        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1,right+1};

            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{-1,-1};
        
    }
}
// @lc code=end

