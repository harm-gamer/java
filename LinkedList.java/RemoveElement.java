// Remove Linked List Element 
// if Node.val == val
public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class RemoveElement {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
          ListNode dummy = new ListNode(-1);
          dummy.next = head;
          
          ListNode pre = dummy;
          ListNode curr = head;
          
      while(curr != null){
          if(curr.val == val){
              pre.next = curr.next;
          }
          else{
              pre = curr;
          }
          curr = curr.next;
      }
          return dummy.next;
      }
}
