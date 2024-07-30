package com.Rahul;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<List<Integer>> levelOrder(LevelOrderTraversal root) {
        Queue<LevelOrderTraversal> queue=new LinkedList<LevelOrderTraversal>();
        List<List<Integer>> wrapList=new LinkedList<List<Integer>>();
        if(root == null){
            return wrapList;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int level= queue.size();
            List<Integer> sublist=new LinkedList<>()
            for (int i = 0; i < level; i++) {
                 if(queue.peek().left != null) queue.offer(queue.peek().left);
                 if(queue.peek().right != null) queue.offer(queue.peek().right);
                 sublist.add(queue.poll().val);
            }
            wrapList.add(sublist);
        }
        return wrapList;
    }
}