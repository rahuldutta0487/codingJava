package com.Rahul;

public class POstorder {
}

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> postOrder=new ArrayList<>();
        postOrder(root,postOrder);
        return postOrder;
    }

    void postOrder(TreeNode curr, ArrayList<Integer> postOrder){
        if(curr== null){
            return;
        }
        postOrder(curr.left,postOrder);
        postOrder(curr.right,postOrder);
        postOrder.add(curr.val);

    }
}
