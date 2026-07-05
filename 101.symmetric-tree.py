#
# @lc app=leetcode id=101 lang=python
#
# [101] Symmetric Tree
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        def ismirror(t1,t2):
            if t1 is None and t2 is None:
                return True
            if t1 is None or t2 is None:
                return False
            
            return (t1.val==t2.val and ismirror(t1.left,t2.right) and ismirror(t1.right,t2.left))
        return ismirror(root.left,root.right)
    
        
                
    
            
# @lc code=end

