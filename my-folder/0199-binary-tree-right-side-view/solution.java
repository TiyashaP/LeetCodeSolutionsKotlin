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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList();
        List<Integer> integerList=new LinkedList();
        if(root==null)
            return integerList;
        queue.add(root);
        while(!queue.isEmpty())
        {   int size=queue.size();
            int count=0;
            while(count<size){
            TreeNode popped=queue.remove();
            if(count==0)
            {integerList.add(popped.val);
            }
            if(popped.right!=null)
            queue.add(popped.right);
            if(popped.left!=null)
            queue.add(popped.left);      
            count++;    
            }
            
        } 
        
        return integerList;
        
    }
}
