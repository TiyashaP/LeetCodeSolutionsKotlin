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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        
        if(null==root)
            return root;
        root.right=trimBST(root.right,low,high);
        root.left=trimBST(root.left,low,high);
         
           if(root.val>high) 
           {
               TreeNode lchild=root.left;
               root=null;
               return lchild;
           }
        if(root.val<low) 
           {
               TreeNode rchild=root.right;
               root=null;
               return rchild;
           }
            
                   
       return root; 
    }
}
