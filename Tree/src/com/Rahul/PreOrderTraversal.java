package com.Rahul;

public class PreOrderTraversal {

}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> preOrder=new ArrayList<>();
        preOrder(root,preOrder);
        return preOrder;
    }
    void preOrder(TreeNode curr, ArrayList<Integer> preOrder){
        if (curr==null){
            return;
        }
        preOrder.add(curr.val);
        preOrder(curr.left,preOrder);
        preOrder(curr.right,preOrder);

    }
}
