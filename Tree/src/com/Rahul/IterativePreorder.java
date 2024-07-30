package com.Rahul;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class prePOstInAllTraversal {
}

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder=new ArrayList<>();
        if(root == null){
            return preorder;
        }
        Stack<Integer> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            root=stack.pop();
            preorder.add(root.val);
            if(root.right != null){
                stack.push(root.right);
            }
            if(root.left != null){
                stack.push(root.left);
            }


        }
        return preorder;
    }