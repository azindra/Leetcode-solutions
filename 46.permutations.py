#
# @lc app=leetcode id=46 lang=python
#
# [46] Permutations
#

# @lc code=start
class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result=[]
        def backtarck(path):
            if len(path)==len(nums):
                result.append(path[:])
                return 
            for num in nums:
                if num in path:
                    continue
                path.append(num)
                backtarck(path)
                path.pop()
        backtarck([])
        return result
    

# @lc code=end

