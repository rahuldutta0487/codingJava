package com.Rahul;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum3(10,20);
        System.out.println(ans);
    }

// pass the value of numbers when you are calling the method in main()
    static int sum3(int a,int b){
        int sum= a+b;
        return sum;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the 1st nyumber");
        int num1= in.nextInt();
        System.out.print("enter the 2nd nyumber");
        int num3= in.nextInt();
        int sum=num1+num3;
        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the 1st nyumber");
        int num1= in.nextInt();
        System.out.print("enter the 2nd nyumber");
        int num3= in.nextInt();
        int ans=num1+num3;
        System.out.print("the sum is:" + ans);

    }
}
