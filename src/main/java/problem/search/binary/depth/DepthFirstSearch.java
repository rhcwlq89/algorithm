package problem.search.binary.depth;

import problem.search.binary.TreeNode;

import java.util.Stack;

public class DepthFirstSearch {

    public DepthFirstSearch() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.getLeft().setLeft(new TreeNode(3));
        root.getLeft().getLeft().setLeft(new TreeNode(4));
        root.getLeft().getLeft().getLeft().setLeft(new TreeNode(5));
        root.getLeft().getLeft().setRight(new TreeNode(6));
        root.getLeft().setRight(new TreeNode(7));
        root.setRight(new TreeNode(8));
        root.getRight().setLeft(new TreeNode(9));
        root.getRight().setRight(new TreeNode(10));

        solutionDfs(root);
    }

    public int solutionDfs(TreeNode root) {
        if(root == null) return 0;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode pop = stack.peek();
            System.out.println(pop.getVal());
            if(pop.getLeft() != null) {
                stack.push(pop.getLeft());
            } else {
                if(pop.getRight() != null) {
                    stack.push(pop.getRight());
                }
            }
        }

        return 0;
    }
}
