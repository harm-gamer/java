// Palindrom Linked List
public class ListNode {
    int val;
    ListNode next;  
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Pallendrom {
    public ListNode findmiddle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast!=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        
        ListNode middle = findmiddle(head);
        ListNode curr = middle;
        ListNode prev = null;
        ListNode next;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;
        
        while(right != null){
            if(right.val != left.val){
                return false;
            }
            right = right.next;
            left = left.next;
            
        }
        return true;
    }
}
