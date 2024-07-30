package com.Rahul;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
}


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> inOrder=new ArrayList<>();
        inOrder(root,inOrder);
        return inOrder;
    }

    void inOrder(TreeNode curr, ArrayList<Integer> inOrder){
        if(curr== null){
            return;
        }
        inOrder(curr.left,inOrder);
        inOrder.add(curr.val);
        inOrder(curr.right,inOrder);
    }
}
