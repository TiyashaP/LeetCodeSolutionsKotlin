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
    public List<List<Integer>> levelOrder(TreeNode root) {
           List<List<Integer>> integerList= new LinkedList<>();
        if(root==null)
            return Collections.emptyList();
        Queue<TreeNode> treeNodeList=new LinkedList<>();
        treeNodeList.add(root);
        while(!treeNodeList.isEmpty())
        {
            int count=treeNodeList.size();
            List<Integer> integerListLevel= new LinkedList<>();
            for(int i=0;i<count;i++)
            {
                TreeNode popped=treeNodeList.poll();
                if(popped.left!=null)
                    treeNodeList.add(popped.left);
                if(popped.right!=null)
                    treeNodeList.add(popped.right);
                integerListLevel.add(popped.val);
            }
            integerList.add(integerListLevel);
        }
        return integerList;
        
    }
}
