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
    int sum_value = 0;
    public void sum(TreeNode root, int low, int high){
        if(root == null){
            return ;
        }
        sum(root.left,low,high);
        if(root.val>=low && root.val<=high){
            sum_value += root.val;
        }
        sum(root.right,low,high);
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {

        sum(root,low,high);
        return sum_value;
    }
}