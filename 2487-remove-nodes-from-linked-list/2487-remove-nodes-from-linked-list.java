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
    public ListNode removeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        ListNode currNode=head;
        Stack <ListNode> stack=new Stack<>();

        while(currNode!=null){
            while(!stack.isEmpty()&&stack.peek().val<currNode.val)
                stack.pop();

            stack.push(currNode);
            currNode=currNode.next;
        }
        for(ListNode node:stack){
            tail.next=node;
            tail=tail.next;
        }
        return dummy.next;
    }
}