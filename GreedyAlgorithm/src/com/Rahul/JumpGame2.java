package com.Rahul;

public class JumpGame2 {
}
// here have to find the jumping index

class Solution {
    public int jump(int[] nums) {
        int jumps = 0; // Number of jumps made
        int l = 0;     // Left boundary of the current jump range
        int r = 0;     // Right boundary of the current jump range
        int n = nums.length;

        while (r < n - 1) {
            int farthest = 0; // Farthest point that can be reached in the next jump
            for (int index = l; index <= r; index++) {
                farthest = Math.max(farthest, index + nums[index]);
            }
            l = r + 1;
            r = farthest;
            jumps++;
        }

        return jumps;
    }
}
