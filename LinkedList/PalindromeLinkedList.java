public class PalindromeLinkedList{
   public ListNode getMidPoint(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
           while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // For odd length, skip the middle node
        if (fast != null) {
            slow = slow.next;
        }
        return slow;
    }
  
    public ListNode revereseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;

        }
        return prev;
    }
  
    public boolean isPalindrome(ListNode head) {

        //Step1: Break The Linked List
        ListNode list2 = getMidPoint(head);

        
        //Step2: ll2->reverse

        ListNode head2 =  revereseLinkedList(list2);

        //step3: ll1 and ll2 compare
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while(temp1!=null && temp2!=null ){
            if(temp1.val!=temp2.val){
                return false;
            }
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }

        return true;
      
        
    }   
}
