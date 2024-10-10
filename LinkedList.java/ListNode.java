
// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;  
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
            ListNode res = node;
            int carry = 0;
            int total = 0;
            while(l1 != null || l2 !=null ||  carry !=0){
                 total = carry;
                 if(l1 != null){
                     total += l1.val;
                     l1 = l1.next;
                 }
                if(l2 !=null){
                    total += l2.val;
                    l2 = l2.next;
                }
                
                int num = total % 10;
                carry =  total / 10;
                node.next = new ListNode(num);
                node = node.next;
            }
            
            return res.next;
        }
}
