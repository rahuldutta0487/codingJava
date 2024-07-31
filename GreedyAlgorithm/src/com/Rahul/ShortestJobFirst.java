package com.Rahul;

import java.util.Arrays;

public class ShortestJobFirst {
}
class Solution {
    static int solve(int bt[] ) {
        // code here
        Arrays.sort(bt);
        int n=bt.length;
        int t=0;
        int wt=0;
        for(int i=0;i< n; i++){
            wt += t;
            t += bt[i];
        }
        return (wt/n);

    }
}
