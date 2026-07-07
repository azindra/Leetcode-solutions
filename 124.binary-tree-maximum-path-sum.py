#
# @lc app=leetcode id=124 lang=python
#
# [124] Binary Tree Maximum Path Sum
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def maxPathSum(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        self.ans=float("-inf")
        def dfs(node):
            if node is None:
                return 0
            left=max(dfs(node.left),0)
            right=max(dfs(node.right),0)
            self.ans=max(self.ans,left+right+node.val)
            return node.val+max(left,right)
        dfs(root)
        return self.ans
        
# @lc code=end

