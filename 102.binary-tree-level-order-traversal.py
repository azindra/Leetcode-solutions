#
# @lc app=leetcode id=102 lang=python
#
# [102] Binary Tree Level Order Traversal
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import deque
class Solution(object):
    def levelOrder(self, root):
        if root is None:
            return []
        """
        :type root: Optional[TreeNode]
        :rtype: List[List[int]]
        """
        queue=deque([root])
        result=[]
        while queue:
            level=[]
            size=len(queue)
            for i in range(size):
             
             node=queue.popleft()
             level.append(node.val)
             if node.left:
                 queue.append(node.left)
             if node.right:
                 queue.append(node.right)
            result.append(level)
        return result


# @lc code=end

