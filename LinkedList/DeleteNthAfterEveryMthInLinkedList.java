public class DeleteNthAfterEveryMthInLinkedList{
  static void linkDelete(Node head, int n, int m) {
        Node curr = head;
        Node prev = null;
        
        while(curr!=null){
            for(int i=1;i<=m && curr!=null;i++){
                prev = curr;
                curr = curr.next;
                
            }
            if(curr==null){
                return;
            }
            for(int i=1;i<=n && curr!=null;i++){
                curr = curr.next;
            }
            prev.next = curr;
        }      
        
    }
}
