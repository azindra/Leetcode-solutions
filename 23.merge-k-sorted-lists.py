#
# @lc app=leetcode id=23 lang=python
#
# [23] Merge k Sorted Lists
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
import heapq
class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[Optional[ListNode]]
        :rtype: Optional[ListNode]
        """
        heap=[]
        for i , node in enumerate(lists):
            if node:
                heapq.heappush(heap,(node.val,i,node))
        dummy=ListNode(0)
        curn=dummy
        while heap:
            value,i,node=heapq.heappop(heap)
            curn.next=node
            curn=curn.next
            if node.next:
                heapq.heappush(heap,(node.next.val,i,node.next))
        return dummy.next


        
# @lc code=end

