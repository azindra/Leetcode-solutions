#
# @lc app=leetcode id=438 lang=python
#
# [438] Find All Anagrams in a String
#

# @lc code=start
from collections import Counter
class Solution(object):
    def findAnagrams(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: List[int]
        """
        indexx=[]
        if len(s)<len(p):
            return[]
        k=len(p)
        pcount=Counter(p)
        windowCount=Counter(s[:k])
        if pcount==windowCount:
            startindex=0
            indexx.append(startindex)
        for i in range(k,len(s)):
            windowCount[s[i]]+=1
            left=s[i-k]
            windowCount[left]-=1
            if windowCount[left]==0:
                del windowCount[left]
            if pcount==windowCount:
                indexx.append(i-k+1)
        return indexx
        
# @lc code=end

