#
# @lc app=leetcode id=77 lang=python
#
# [77] Combinations
#

# @lc code=start
class Solution(object):
    def combine(self, n, k):

        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        result=[]
        def bracktrack(start,path):
            if len(path)==k:
                result.append(path[:])
                return
            for i in range(start,n+1):
                path.append(i)
                bracktrack(i+1,path)
                path.pop()

        bracktrack(1,[])
        return result
# @lc code=end

