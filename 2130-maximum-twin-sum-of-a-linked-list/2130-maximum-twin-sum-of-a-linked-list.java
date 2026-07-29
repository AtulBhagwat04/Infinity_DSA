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
    public int pairSum(ListNode head) {
        if (head == null || head.next == null) {
            return -1;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        //find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse from mid
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        //check sum
        int max = 0, sum = 0;
        while (head != null && prev != null) {
            sum = head.val + prev.val;
            max = Math.max(max, sum);
            head = head.next;
            prev = prev.next;
        }
        return max;
    }
}