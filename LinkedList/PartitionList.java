public class PartitionList{
   ListNode lessNode = new ListNode(-1);
        ListNode greatNode = new ListNode(-1);

        ListNode lessHead = lessNode;
        ListNode greatHead = greatNode;
        ListNode lessTail = lessNode;
        ListNode greatTail = greatNode;

        ListNode temp = head;

        while(temp!=null){
            if(temp.val<x){
                ListNode nodeToInsert = temp;
                temp = temp.next;
                nodeToInsert.next = null;
                lessTail.next =nodeToInsert;
                lessTail = nodeToInsert;
            }
            else{
                ListNode nodeToInsert = temp;
                temp = temp.next;
                nodeToInsert.next = null;
                greatTail.next = nodeToInsert;
                greatTail = nodeToInsert;
            }
            
        }

        lessTail.next = greatHead.next;
        greatTail.next = null;
        lessHead = lessHead.next;

        return lessHead;
}
