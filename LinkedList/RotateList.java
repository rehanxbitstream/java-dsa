public class RotateList{
  public ListNode rotateRight(ListNode head, int k) {
    
        if(head==null || k==0){
            return head;
        }
        
        ListNode tail = head;
        int n = 1;

        while(tail.next!=null){
            tail = tail.next;
            n++;
        }
        if(k%n==0){
            return head;
        }
        k=k%n;

        tail.next = head;
        ListNode prev = head;
        
        for(int i=1;i<=n-k-1;i++){
            prev = prev.next;

        }

        ListNode newHead = prev.next;
        prev.next = null;
     
        return newHead;      
        
    }
}
