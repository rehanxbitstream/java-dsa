public class AddOneToLinkedList{
  public Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public Node addOne(Node head) {
        head = reverse(head);
        Node curr = head;
        int carry = 1;
        int sum = 0;
        
        while(curr!=null){
            int val = curr.data;
            sum = val+carry;
            int digit = sum%10;
            
            curr.data = digit;
            
            carry = sum/10;
            if(curr.next==null && carry>0){
                curr.next = new Node(carry);
                carry = 0;           
            }
            curr = curr.next;
            
        }
        return reverse(head);
        
    }
}
