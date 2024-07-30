package com.Rahul;

public class ZigZajLevelOrderTraversal {
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> sublist = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                if (leftToRight) {
                    sublist.add(node.val);
                } else {
                    sublist.add(0, node.val); // Add elements in reverse order for zigzag pattern
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(sublist);
            leftToRight = !leftToRight; // Toggle the direction for the next level
        }

        return result;

    }
}
