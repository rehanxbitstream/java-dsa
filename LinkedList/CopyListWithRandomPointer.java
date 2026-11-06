public class CopyListWithRandomPointer{
   public Node copyRandomList(Node head) {
        if(head==null){
            return head;
        }

        //Step1 Clone nodes add

        Node temp = head;

        while(temp!=null){
            Node clone = new Node(temp.val);
            clone.next = temp.next;
            temp.next = clone;
            temp = clone.next;
           
        }

        //Step 2 : Copy random pointers

        temp = head;

        while(temp!=null){

        Node oldNode = temp;
        Node newNode  = temp.next;

        if(oldNode.random!=null){
            newNode.random = oldNode.random.next;
        }

        temp = newNode.next;

        }
        temp = head;
        Node ansListHead = head.next;

        while(temp!=null){
            Node oldNode = temp;
            Node cloneNode = temp.next;


            oldNode.next = cloneNode.next;
            if(cloneNode.next!=null)  cloneNode.next = cloneNode.next.next;

            temp = temp.next;
           
        }
        return ansListHead;
       
}
}
