// Remove kth node from End of LinkedList


public class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){ this.val = val;}
    ListNode(int val , ListNode next){
        this.val = val;
        this.next= next;
    }

 class RemovefromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        int size =0;
        ListNode curr  = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(size == n){
            return head.next;
        }
        int index = size-n;
        ListNode prev = head;
        int j =1;
        while(j<index){
            prev = prev.next;
            j++;
        }
        
        prev.next = prev.next.next;
        return head;
    }
}
}