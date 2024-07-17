package com.Rahul;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a");
        int a= in.nextInt();
        System.out.println("enter b");
        int b= in.nextInt();
        System.out.println("enter c");
        int c= in.nextInt();

        // max between three numbers
        int max=a;
        if( b>max){
            max=b;
        }
        if( c> max){
            max =c;
        }
        System.out.println("the largest number is: "+ max);

    }
}
