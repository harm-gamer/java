



    
public class MergeSort {
    public class ListNode{
        int val ;
        ListNode next;

        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val ,ListNode next){this.val = val; this.next = next;}
    }
    public ListNode sortList(ListNode head){
     
        ListNode mid = getMiddle(head);
        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;
        left = sortList(left);
        right = sortList(right);

        return merge(left,right);
    }
    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Merge the two lists
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in either list, append them
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }
public  ListNode getMiddle(ListNode head){


ListNode slow = head;
ListNode fast  = head;


while(fast != null && fast.next != null){
    fast = fast.next.next;
    slow = slow.next;


}
return slow;
}    
}
