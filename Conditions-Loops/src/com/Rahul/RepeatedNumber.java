package com.Rahul;

import java.util.Scanner;

public class RepeatedNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:" );
        int n = in.nextInt();
        int count =0;
        while(n>0){
            int rem = n % 10;
            if(rem == 3){
                count ++;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}
