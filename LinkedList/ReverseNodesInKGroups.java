public class ReverseNodesInKGroups{
   if (head == null || k <= 1) {
            return head;
        }

         // Check whether k nodes exist
        ListNode temp = head;

        for (int i = 0; i < k; i++) {
            if (temp == null) {
                return head;
            }
            temp = temp.next;
        }
        
        //Reverse first k len group
        ListNode prev = null;
        ListNode curr = head;

        for(int i=1;i<=k;i++){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        //reverse remaining list using recursion
        ListNode ansNode = reverseKGroup(curr,k);

        head.next = ansNode;

        return prev;
    
    }
}
