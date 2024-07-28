package com.Rahul;

public class fact {
    public static void main(String[] args) {
        int ans=factiorial(5);
        System.out.println(ans);
    }

    static int factiorial(int n){
        if(n==1){
            return 1;
        }

        return n*factiorial(n-1);
    }
}
