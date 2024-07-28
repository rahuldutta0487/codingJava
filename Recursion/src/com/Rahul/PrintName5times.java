package com.Rahul;

import java.util.Scanner;

public class PrintName5times {
    public static void main(String[] args) {
        printname(1,5);
    }

    static void printname(int i, int n){
        if(i>n){
            return;
        } else {
            System.out.println("Rahul");
            printname(i+1,n);
        }
    }
}

