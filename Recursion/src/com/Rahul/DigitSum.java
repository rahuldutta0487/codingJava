package com.Rahul;

public class DigitSum {
    public static void main(String[] args) {
        int result=sum(1324);
        System.out.println(result);
    }

    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
}
