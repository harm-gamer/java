package MicroSoft.Medium;

public class DeleteNodeinLinkedList {
     public class ListNode {
            int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
        
       
           public void deleteNode(ListNode node) {
               ListNode prev = null;
               while(node.next !=null){
                   node.val = node.next.val;
                   prev = node;
                   node = node.next;
               }
               prev.next = null;
           
       }
}
