public class MergeNodesInBetweenZeroes{
   public ListNode mergeNodes(ListNode head) {
        ListNode write = head;
        ListNode read = head.next;
        
        while(read!=null){
            int sum =0;
            while(read.val!=0){
                sum+=read.val;
                read = read.next;
            }
            write.val = sum;
            write.next = read.next;
            read = read.next;
            write = write.next;
        }
       
        return head;
       
    }
  
}
