class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ele=new ListNode (0);
        ele.next=head;
        ListNode curr=ele;
        while(curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return ele.next;
    }
}