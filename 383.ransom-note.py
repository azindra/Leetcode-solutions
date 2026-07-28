#
# @lc app=leetcode id=383 lang=python
#
# [383] Ransom Note
#

# @lc code=start
from collections import Counter
class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        countr=Counter(ransomNote)
        countm=Counter(magazine)
        for i in countr:
            if countr[i]>countm[i]:
                return False
        return True
        
# @lc code=end

