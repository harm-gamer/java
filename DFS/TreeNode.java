package DFS;

import java.util.ArrayList;
import java.util.List;


public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
        
public class Inorder {
     public List<Integer> inorderTraversal(TreeNode root) {
        
        
        List<Integer> ans = new ArrayList<>();
        isTreverse(root,ans);
        return ans;
    }
    public void isTreverse(TreeNode node,List<Integer> ans){
        if(node != null){
            isTreverse(node.left,ans);
            ans.add(node.val);
            isTreverse(node.right,ans);
        }
    }
}
}