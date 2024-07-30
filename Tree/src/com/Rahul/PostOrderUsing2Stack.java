package com.Rahul;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class PostOrderUsing2Stack{
    public int PostOrder(TreeNode root){
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();

        List<TreeNode> postorder=new ArrayList<>();
        if(root == null){
            return postorder;
        }
        st1.push(root);
        while (!st1.isEmpty()){
            root=st1.pop();
            if(root.left != null) st1.push(root.left);
            if(root.right != null) st1.push(root.right);

        }
        while (!st2.isEmpty()){
            postorder.add(st2.pop().val);
        }
        return postorder;
    }
}
