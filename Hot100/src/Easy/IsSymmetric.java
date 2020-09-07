package Easy;

import util.TreeNode;

/**
 * @author Jialu Hu
 * @create 2020-09-07 18:23
 * 对称二叉树
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return helper(root,root);
    }
    private boolean helper(TreeNode a,TreeNode b){
        if(a == null && b == null)
            return true;
        else if(a == null || b == null)
            return false;
        else
            return (a.val == b.val) && helper(a.left,b.right) && helper(a.right,b.left);
    }
}
