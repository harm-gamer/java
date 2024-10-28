package DFS;
public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
         TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
             this.right = right;
     } 
    } 
public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        
        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left,remainingSum ) || hasPathSum(root.right,remainingSum);
    }
}

