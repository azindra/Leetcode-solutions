/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //dummy
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        //move fast n+1 steps 
        for(int i =0;i<=n;i++){
            fast = fast.next;
        }
        //move bothpointer till fast reaches the end
        while(fast!=null){
            fast = fast .next;
            slow = slow.next;
        }
        
        //skip or remove the value
        slow.next= slow.next.next;
        return dummy.next;
        
    }
}
// @lc code=end

