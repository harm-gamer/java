// Remove duplicates from sorted list
 
public class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
         while(curr != null && curr.next != null){
             if(curr.val == curr.next.val){
                 curr.next = curr.next.next;
             }else{
                 curr = curr.next; 
             }
         }
         return head;
     }
}
