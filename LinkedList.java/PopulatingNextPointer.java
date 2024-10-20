
public class Node{
    int val;
    Node left;
    Node right;
    Node next;

    Node(){}

    Node(int val){
        this.val = val;
        
    }
    Node(Node right,Node left,Node next,int val){
        this.val = val;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}

public class PopulatingNextPointer {
    public Node connect(Node root){
    Node level_start=root;
    while(level_start!=null){
        Node cur=level_start;
        while(cur!=null){
            if(cur.left!=null) cur.left.next=cur.right;
            if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;
            
            cur=cur.next;
        }
        level_start=level_start.left;
    }
    return root;
}
    }

