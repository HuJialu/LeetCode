package Easy;

import util.TreeNode;

/**
 * @author Jialu Hu
 * @create 2020-09-07 18:34
 * 二叉树的最大深度
 */
public class MaxDepth {
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
}
