/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head .next == null) return true;

        //middle element
        ListNode fast = head ;
        ListNode slow = head;
        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        //split 
        ListNode second = slow.next;
        //reverse second half
        ListNode prev = null;
        while(second!=null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second=temp;
        }
        //compare
        ListNode first = head;
        second=prev;
        while(second!=null){
            if(first.val !=second.val)
                return false;
            first=first.next;
            second=second.next;

            

        }
        return true;
        
    }
}
// @lc code=end

