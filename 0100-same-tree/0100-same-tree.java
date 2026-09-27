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

    public void findNode(TreeNode x, List<Integer> values) {

        if (x == null) {
            values.add(null);
            return;
        }

        values.add(x.val);

        findNode(x.left, values);
        findNode(x.right, values);

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        List<Integer> listP = new ArrayList<>();
        List<Integer> listQ = new ArrayList<>();

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        findNode(p, listP);
        findNode(q, listQ);

        return Objects.equals(listP, listQ);
    }
}