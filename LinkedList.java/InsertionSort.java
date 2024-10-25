// Insertion sort in LinkedList

public class ListNode{
    int val;
ListNode next;

ListNode() {}
ListNode(int val){this.val = val;}
ListNode(int val,ListNode next) {this.val = val ; this.next = next;}


}

public class InsertionSort {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        while(curr != null){
            
            ListNode nextNode = curr.next;
            
            ListNode prev = dummy;
            ListNode currSorted = dummy.next;
            
            while(currSorted !=null && currSorted.val < curr.val){
                prev = currSorted;
                currSorted = currSorted.next;
            }
            
            curr.next = currSorted;
            prev.next = curr;
         
              curr = nextNode;
        }
        
        return dummy.next;
    }
}
