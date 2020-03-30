package recursion;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * leetcode 589. N叉树的前序遍历
 * https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal/description/
 */
public class NAryTreePreorderTraversal {
    // //方法一：递归
    // List<Integer> result = new ArrayList<>();
    // public List<Integer> preorder(Node root) {
    //     if (root == null){
    //         return result;
    //     }
    //     result.add(root.val);
    //     for (int i = 0; i < root.children.size(); i++){
    //         preorder(root.children.get(i));
    //     }
    //     return result;
    // }


    //方法二：迭代
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output= new LinkedList<>();
        if (root == null){
            return output;
        }

        stack.add(root);

        while (!stack.isEmpty()){
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for (Node item : node.children){
                stack.add(item);
            }
        }
        return output;
    }


    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
