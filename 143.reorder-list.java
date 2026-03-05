/*
 * @lc app=leetcode id=143 lang=java
 *
 * [143] Reorder List
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
    public void reorderList(ListNode head) {
        if(head ==null || head.next==null) return;
        ListNode fast = head;
        ListNode slow = head;

        //middle element[1,2,3,4,5] middle 3
        while(fast.next !=null && fast.next.next !=null){
            slow = slow.next;
            fast=fast.next.next;

        }
        //split the ll
        ListNode second = slow.next;//4 ,5 (second half)
        slow.next = null;
        //reverse second half
        ListNode prev = null;//4,5
        while(second!=null){
            ListNode temp = second.next;
            second.next=prev;
            prev=second;
            second=temp;

        }
        //merge both 
        ListNode first = head;
         second=prev;
         while(second!=null){
            ListNode temp1= first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next = temp1;
            first=temp1;
            second= temp2;
         }

        
    }
}
// @lc code=end

