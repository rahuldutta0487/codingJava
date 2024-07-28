package com.Rahul;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        recur(1);
    }
    static void recur(int n){
        if(n==4){
            return;
        } else {
            System.out.println(n);
            recur(n++);
        }
    }
}