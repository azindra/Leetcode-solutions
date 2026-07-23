#
# @lc app=leetcode id=724 lang=python
#
# [724] Find Pivot Index
#[1,2,3,4]

# @lc code=start
class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        totalsum=sum(nums)
        leftsum=0
        for i in range(len(nums)):
            rightsum=totalsum-leftsum-nums[i]
            if rightsum==leftsum:
                return i
            leftsum+=nums[i]
        return -1
    


        
# @lc code=end

