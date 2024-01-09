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

    public void show(TreeNode root, List<Integer> root1 ){
        if(root.left == null && root.right == null){
             root1.add(root.val);
            return;
        }
        if(root.left != null){
            show(root.left,root1);
        }
        if(root.right!=null){
            show(root.right,root1);
        }
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1_list = new ArrayList<Integer>();
        List<Integer> root2_list = new ArrayList<Integer>();
        show(root1,root1_list);
        show(root2,root2_list);
        if(root1_list.size()!=root2_list.size()){
            return false;
        }
        for(int i = 0;i<root1_list.size();i++){
            if(root1_list.get(i) != root2_list.get(i)){
                return false;
            }
        }
        return true;
    }
}