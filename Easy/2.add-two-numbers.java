/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null){

            // get node values
            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;
            
            // sum both node value and carry
            int curSum = l1Val + l2Val + carry;

            // carry and store sum
            int lastDigit = curSum % 10;
            carry = curSum / 10;

            // add to return node
            ListNode NewAdd = new ListNode (lastDigit);
            l3.next = NewAdd;

            // if not end move pointer
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;

        }

        // check if any leftover
        if (carry > 0 ){
                
            ListNode leftOver = new ListNode(carry);
            l3.next = leftOver;
            l3 = l3.next;
        }


        return dummyHead.next;

    }
}
// @lc code=end

