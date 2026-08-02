class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer>list=new ArrayList<>();
        for(ListNode head:lists){
            while(head!=null){
                list.add(head.val);
                head=head.next;
            }
        }
        Collections.sort(list);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        for(int i=0;i<list.size();i++){
            temp.next=new ListNode(list.get(i));
            temp=temp.next;
        }
        return dummy.next;
    }
}