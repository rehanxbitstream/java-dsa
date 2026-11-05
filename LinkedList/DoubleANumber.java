public class DoubleANumber{
  public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {

        ListNode newHead = reverse(head);
        int sum = 0;
        int carry = 0;
        ListNode temp = newHead;
        ListNode tail = null;
        
        while(temp!=null){
            
            sum = temp.val*2 +carry;
            temp.val  = sum%10;
            carry = sum/10;

            tail = temp;
             
            temp = temp.next;
           
           
        }
        if(carry!=0){
                tail.next  = new ListNode(carry);
                
            }

        return reverse(newHead);
    }
}
