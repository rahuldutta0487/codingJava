package com.Rahul;

public class Maxwelth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        int ans=Integer.MIN_VALUE;
        for (int persion = 0; persion < accounts.length; persion++) {
            int sum=0;
            for (int account = 0; account < accounts[persion].length; account++) {
                sum = sum+accounts[persion][account];

            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;

    }
}
