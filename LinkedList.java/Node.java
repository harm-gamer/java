
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
    public Node create(Node root){
        if(root == null){
            return null;
            
        }

        Node LeftStart = root;

        while(LeftStart != null){
            
            Node head = LeftStart;

            
                while(head != null){
                
                    head.left.next = head.right;
                    
                    if(head.left != null && head.next !=null){
                        head.right.next = head.next.left;
                    }
                    
                    head = head.next;
                }
                LeftStart = LeftStart.next;
            }
            return root;
        }
    }

