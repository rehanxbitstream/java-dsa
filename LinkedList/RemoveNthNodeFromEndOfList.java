public class RemoveNthNodeFromEndOfList{
   public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = dummy;

        for(int i=0;i<=n;i++){
            curr = curr.next;
        }

        while(curr!=null){
            curr = curr.next;
            prev = prev.next;

        }
        prev.next = prev.next.next;
        return dummy.next;


        
}
