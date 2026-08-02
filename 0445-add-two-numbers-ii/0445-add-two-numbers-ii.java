class Solution {
    ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode currNode = head;
        while (currNode != null) {
            ListNode next= currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        int carry = 0;
        ListNode temp = null;
        while (l1 != null || l2 != null || carry != 0) {
            int sum=carry;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            ListNode node=new ListNode(sum%10);
            node.next=temp;
            temp=node;
            carry=sum/10;
        }
        return temp;
    }
}