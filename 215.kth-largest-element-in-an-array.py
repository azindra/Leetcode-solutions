#
# @lc app=leetcode id=215 lang=python
#
# [215] Kth Largest Element in an Array
#

# @lc code=start
import heapq
class Solution(object):
    def findKthLargest(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        heap=[]
        for i in nums:
            heapq.heappush(heap,i)
            if len(heap)>k:
                heapq.heappop(heap)
        return heap[0]

# @lc code=end

