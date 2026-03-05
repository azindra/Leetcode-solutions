/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //dectect cycle(2 pointers)
        ListNode fast = head ;
        ListNode slow= head ;
        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        
        if(slow==fast){//cycle detected
            //find the starting point of he cycle(ptr == slow)
            ListNode ptr = head;
            while(ptr !=slow){
                ptr=ptr.next;
                slow=slow.next;
            }
            return ptr;}}

            return null;

            
        
    }
}
// @lc code=end

