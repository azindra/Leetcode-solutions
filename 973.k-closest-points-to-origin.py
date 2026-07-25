#
# @lc app=leetcode id=973 lang=python
#
# [973] K Closest Points to Origin
#

# @lc code=start
import heapq
class Solution(object):
    def kClosest(self, points, k):
        """
        :type points: List[List[int]]
        :type k: int
        :rtype: List[List[int]]
        """
        heap=[]
        for x ,y in points:
            dis=x*x+y*y
            heapq.heappush(heap,(-dis,[x,y]))

            if len(heap)>k:
                heapq.heappop(heap)
        answer=[]
        while heap:
            answer.append(heapq.heappop(heap)[1])
        return answer

        
# @lc code=end

