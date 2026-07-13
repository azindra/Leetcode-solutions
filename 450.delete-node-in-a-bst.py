#
# @lc app=leetcode id=450 lang=python
#
# [450] Delete Node in a BST
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def deleteNode(self, root, key):
        """
        :type root: Optional[TreeNode]
        :type key: int
        :rtype: Optional[TreeNode]
        """
        if root is None:
            return None
        if root.val>key:
            root.left=self.deleteNode(root.left,key)
        elif key>root.val:
            root.right=self.deleteNode(root.right,key)
        else:
            if root.left is None:
                return root.right
            if root.right is None:
                return root.left
            #case3
            successor=self.findmin(root.right)
            root.val=successor.val
            root.right=self.deleteNode(root.right,successor.val)
        return root
    def findmin(self,node):
        while node.left:
            node=node.left
        return node



        
# @lc code=end

