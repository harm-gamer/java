//Given the head of a linked list, rotate the list to the right by k places.

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k==0){
            return head;
        }
          ListNode current = head;
          int length = 1;
          while(current.next !=null){
              current = current.next;
              length++;
          }
          
          current.next = head;
          
          k = k % length;
          
          for(int i =0;i<length-k;i++){
              current = current.next;
          }
          head = current.next;
          current.next = null;
          
          return head;
            
      }
}
