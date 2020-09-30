package leetcode.medium;

public class InsertIntoBinarySearchTree {
    
    /**
     * 二叉搜索树
     * BinarySearchTree --> BST
     * 
     * 根节点比左子树大
     * 根节点比右子数小
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode treeNode = new TreeNode(val);
        TreeNode temp = root;
        if(root == null) return (root = treeNode);

        while(true){
            //如果比根节点大
            if(val > temp.val){
                // 放在右边
                if(temp.right != null){
                    temp = temp.right;
                }else{
                    temp.right = treeNode;
                    break;
                }
            }else {
                // 放在左边
                if(temp.left != null){
                    temp = temp.left;
                }else{
                    temp.left = treeNode;
                    break;
                }
            }
        }
        return root;
    }

}