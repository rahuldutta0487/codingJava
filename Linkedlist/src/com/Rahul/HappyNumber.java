package com.Rahul;
//https://leetcode.com/problems/happy-number/
public class HappyNumber {
    public static void main(String[] args) {

    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do {
            slow=findSquare(slow);
            fast=findSquare(findSquare(fast));
        } while (fast != slow);

        if(slow==1){
            return true;
        } else {
            return false;
        }

    }
    private int findSquare(int num){
        int ans=0;
        while(num>0){
            int rem=num%10;
            ans += rem*rem;
            num=num/10;

        }
        return ans;
    }
}
