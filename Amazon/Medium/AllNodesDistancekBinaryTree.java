package Amazon.Medium;
import java.util.*;

import java.util.ArrayList;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.right = right;
        this.left = left;
    }

}

public class AllNodesDistancekBinaryTree{

  public void print(TreeNode root, int k){
        if(root == null || k<0) return;
        if(k== 0){
            System.out.print(root.val + "");
            return;
        }
        
        print(root.left,k-1);
        print(root.right,k-1);
        
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        if(root == null) return null;
        if(root == target){
            print(root,k);
        }
        List<Integer> ans = new ArrayList<>();
        int dl = distanceK(root.left,target,k);
        
        if(dl != -1){
            if(dl+1 == k){
                ans.add(root.val);
                
            } 
            else{
                print(root.right,k-dl-2);
            }
            return 1 +dl;
        }
        int dr = distanceK(root.right,target,k);
        if(dr != -1){
            if(dl+1 == k){
                ans.add(root.val);
                
            } 
            else{
                print(root.left,k-dl-2);
            }
            return 1 +dr;
        }
        return ans;
    }
}