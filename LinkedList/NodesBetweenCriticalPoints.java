public class NodesBetweenCriticalPoints{
   public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null){
            return new int[]{-1,-1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        List<Integer> list = new ArrayList<>();
        int i=1;
        while(curr!=null && curr.next!=null){
            
            if(curr.val>prev.val && curr.val>curr.next.val){
                list.add(i);
                
            }
            else if(curr.val<prev.val && curr.val<curr.next.val){
                list.add(i);
                
            }
            
            curr = curr.next;
            prev = prev.next;
            i++;
        }
        if(list.size()<2){
            return new int[]{-1,-1};
        }
        int minDistance = Integer.MAX_VALUE;

        for(int j=1;j<list.size();j++){
            minDistance = Math.min(minDistance,list.get(j)-list.get(j-1));
        } 
        
        int maxDistance = list.get(list.size()-1)-list.get(0);
        

        return new int[]{minDistance,maxDistance};
    }
}
