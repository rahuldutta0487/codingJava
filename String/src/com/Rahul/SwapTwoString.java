package com.Rahul;

public class SwapTwoString {
    public static void main(String[] args) {
        String x="ABC";
        String y="TECH";
        String temp="";

        System.out.println("Before swapping"+x);
        System.out.println("Before swapping"+y);

        temp=x;
        x=y;
        y=temp;

        System.out.println("After swapping"+x);
        System.out.println("After swapping"+y);
    }
}
