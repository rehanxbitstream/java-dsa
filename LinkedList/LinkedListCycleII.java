public class LinkedListCycleII{

    public ListNode detectCycle(ListNode head) {
       ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        

        while(fast!=null && fast.next!=null){
            
            fast = fast.next;
            
            if(fast.next!=null) { 
              
            fast = fast.next;
         
            slow = slow.next;
            }
            if(slow == fast){
                flag = true;
                break;
            }
            
        }
        if(!flag){
            return null;
        }

        slow = head;

        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
     
        
    }
 
}
