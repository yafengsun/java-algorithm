import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class BinaryTreePostorderTraversal{
    private List<Integer> list = new ArrayList<>();
    /**
     * 二叉树的后序遍历
     * 
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
       if(root != null){
           postorderTraversal(root.left);
           postorderTraversal(root.right);
           list.add(root.val);
       }
       return list;
    } 

    /**
     * 后续遍历使用栈来模拟
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        // 一直往栈里面放左节点，放到没有为止。
        // 然后接着放右节点，右节点又回放左节点

        if(root == null) return list;

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()){
            // 栈顶元素
            TreeNode top = stack.peek();
            if(top.left != null){
                stack.push(top.left);
            }else if(top.right != null){
                stack.push(top.right);
            }else{
                list.add(top.val);
                stack.pop();
            }
        }
        return list;
     } 

}