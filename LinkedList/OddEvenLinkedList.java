public class OddEVenLinkedList{
   public ListNode oddEvenList(ListNode head) {

        if(head == null){
            return head;
        }
        if(head.next ==null){
            return head;
        }

        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddTail = head;
        ListNode evenTail = head.next;

        while(evenTail!=null && evenTail.next!=null){

            oddTail.next = evenTail.next;
            oddTail = evenTail.next;

            evenTail.next = oddTail.next;
            evenTail = oddTail.next;

        }

        oddTail.next = evenHead;

        return oddHead;
        
   }
}
