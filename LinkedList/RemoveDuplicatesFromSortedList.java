public class RemoveDuplicatesFromSortedList{
  public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode prev = head;
        ListNode curr = prev.next;

        while(curr!=null){
            if(curr.val!=prev.val){
                curr = curr.next;
                prev = prev.next;
            }
            else{
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        return head;
        
    }
}
