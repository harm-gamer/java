// Middle of the Linked List
public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
public class Middle {
    public ListNode middleNode(ListNode head) {
        ListNode turtule = head;
         ListNode hear = head;
         
         while(hear != null && hear.next != null){
             hear = hear.next.next;
             turtule = turtule.next;
         }
         
         return turtule;
     }
}
