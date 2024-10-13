// Reverse Linked List
// Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
public class ListNode {
     int val;
     ListNode next;
        ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class ReverseLinkedList {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }
       ListNode dummy = new ListNode(0);
       dummy.next = head;
       ListNode prev = dummy;
       
       for(int i =0;i<left -1;i++){
           prev = prev.next;
       }
       ListNode curr = prev.next;
       ListNode nextnode = null;
       
       
       for(int i=0;i<right-left;i++){
           nextnode = curr.next;
           curr.next = nextnode.next;
           nextnode.next = prev.next;
           prev.next = nextnode;
       }
       return dummy.next;
   }
}
