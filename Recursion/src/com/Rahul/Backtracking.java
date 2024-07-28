package com.Rahul;

public class Backtracking {
    public static void main(String[] args) {
        backtracking(1,3);
    }

    static void backtracking(int i, int n){
//        if(i<1){
//            return;
//        } else{
//            backtracking(i-1,n);
//            System.out.println(i);
//        }
        if(i>n){
            return;
        } else {
            backtracking(i+1, n);
            System.out.print(i + " ");
        }
    }
}
