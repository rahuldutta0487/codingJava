package com.Rahul;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans =0;
        while(true){
            //take the operator as input
            char op = in.next().trim().charAt(0);
            if (op=='+'|| op=='-'|| op=='*'|| op=='/'){
                int num1= in.nextInt();
                int num2=in.nextInt();

                if(op=='+'){
                    ans = num1+num2;
                    System.out.print("the sum is" + ans);
                }
                if(op=='-'){
                    ans = num1-num2;
                    System.out.print("the sum is" + ans);
                }
                if(op=='*'){
                    ans = num1*num2;
                    System.out.print("the sum is" + ans);
                }
                if(op=='/'){
                    ans = num1/num2;
                    System.out.print("the sum is" + ans);
                } else if (op=='x'|| op=='X') {
                   break;
                } else{
                    System.out.println("invalid input");
                }
                System.out.println(ans);
            }

        }
    }
}
