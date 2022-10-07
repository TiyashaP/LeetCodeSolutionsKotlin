/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepthRec(root);
        
    }
    
    public int maxDepthRec(TreeNode node) {
        if(node==null)
            return 0;
        else
           return 1+maxI(maxDepthRec(node.left),maxDepthRec(node.right));
        
    }
    
     public int maxI(int leftHeight,int rightHeight) {
      return leftHeight>rightHeight?leftHeight:rightHeight;
        
    }
    
}
