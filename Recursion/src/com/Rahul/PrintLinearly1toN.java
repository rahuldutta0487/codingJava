package com.Rahul;

import java.util.Scanner;

public class PrintLinearly1toN {
    public static void main(String[] args) {

        print(7,1);
    }

    static void print(int i, int n){
        if(i<n){
            return;
        } else {
            System.out.print(i + " ");
            print(i-1, n);
        }
    }
}
