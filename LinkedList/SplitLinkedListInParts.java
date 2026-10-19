public class SplitLinkedListInParts{
   public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];
        int n = 0;
       
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }
        int baseSize = n/k;

        int extraNode = n%k;

        ListNode prev = null;

        ListNode curr = head;

        for(int part = 0;part<k;part++){
            if(curr==null){
                res[part]=curr;
                continue;
            }
            res[part] = curr;

            int width = baseSize +(extraNode>0?1:0);
            extraNode--;

            for(int i=1;i<=width;i++){
                prev = curr;
                curr = curr.next;

            }
            prev.next = null;

        }
        return res;
    }
}
