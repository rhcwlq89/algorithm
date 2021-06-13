package problem.search.binary.breadth;

import problem.search.binary.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public BreadthFirstSearch() {
        TreeNode root = new TreeNode(10);
        root.setLeft(new TreeNode(9));
        root.getLeft().setLeft(new TreeNode(7));
        root.getLeft().setRight(new TreeNode(8));
        root.getLeft().getLeft().setLeft(new TreeNode(5));
        root.getLeft().getLeft().getLeft().setLeft(new TreeNode(2));
        root.getLeft().getLeft().setRight(new TreeNode(6));
        root.setRight(new TreeNode(11));
        root.getRight().setLeft(new TreeNode(12));
        root.getRight().setRight(new TreeNode(13));

        System.out.println(solutionBfs(root));
    }

    public int solutionBfs(TreeNode root) {
        if(root == null) return 0;
        int count = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i<size; i++) {
                TreeNode node = queue.poll();
                System.out.println(node.getVal());
                if (node.getLeft() != null) {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.offer(node.getRight());
                }
            }
            count++;
        }
        return count;
    }
}
