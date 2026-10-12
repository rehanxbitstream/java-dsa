public class IntersectionOfTwoLinkedLists{
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null && headB == null){
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        

        while(a!=null & b!=null){
            a = a.next;
            b = b.next;
        }
        int bExtraLen = 0;
        if(a==null){
            while(b!=null){
                bExtraLen++;
                b = b.next;
            }
            while(bExtraLen>0){
                headB = headB.next;
                bExtraLen--;
            }

        }
        else{
            int aExtraLen = 0;
            while(a!=null){
                aExtraLen++;
                a = a.next;
            }
            while(aExtraLen>0){
                headA = headA.next;
                aExtraLen--;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            else{
                headA = headA.next;
                headB = headB.next;
            }
        }   

        return null;
        
    }
  
}
