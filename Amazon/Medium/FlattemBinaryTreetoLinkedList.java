package Amazon.Medium;

public class FlattemBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        
        while(root != null){
            if(root.left != null){
                TreeNode curr =  root.left;
                while(curr.right != null){
                    curr = curr.right;
                    
                }
                curr.right = root.right;
                root.right = root.left;
                root.left = null;
                
            }
            root = root.left;
        }
    }
    public void flatten2(TreeNode root) {
        
        if(root == null){
            return ;
        }
        
        flatten2(root.left);
        flatten2(root.right);
        
        TreeNode tempright = root.right;
        
        root.right = root.left;
        root.left = null;
        
        TreeNode curr = root;
        
        
        while(curr.right != null){
            curr = curr.right;
        }
        curr.right = tempright;
    }
}
