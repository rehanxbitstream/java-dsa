public class ReverseLinkedList{
    public ListNode reverseList(ListNode head){
      ListNode curr = head;
      ListNode prev = null;

      while(curr!=null){
        Node forward = curr.next;
        curr.next = prev;
        prev= curr;
        curr = forward;
      }
      return prev;

    }
}
