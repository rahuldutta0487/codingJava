package com.Rahul;

public class DiameterOfBinaryTRee {
}

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] maxi=new int[1];
        height(root,maxi);
        return maxi[0];
    }
    int height(TreeNode root, int[] maxi){
        if(root == null) return 0;

        int lh=height(root.left, maxi);
        int rh=height(root.right, maxi);
        maxi[0]=Math.max(maxi[0],lh+rh);

        return 1+ Math.max(lh,rh);
    }
}
