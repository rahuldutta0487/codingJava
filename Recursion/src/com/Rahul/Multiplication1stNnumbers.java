package com.Rahul;

public class Multiplication1stNnumbers {
    public static void main(String[] args) {
        System.out.println(mul(3));
    }

    static int mul(int n){
        if(n==0){
            return 1;
        } else {
            return n* mul(n-1);
        }
    }
}
