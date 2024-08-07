package com.Rahul;

public class PalindromeReverse {
    public static void main(String[] args) {
        String str="too hot to hoot";
        str.replace(" ","");
        char[] y=str.toCharArray();
        int size=str.length();
        char[] a=new char[size];
        int i=0;
        while(i!=size){
            a[size-1-i]=y[i];
            i++;
        }
        i=0;
        while (i!=size){
            if(a[i] != y[i]){
                System.out.println("Not a palindrome");
                System.exit(0);
            } else {
                ++i;
                continue;
            }
        }
        System.out.println("Palindrome");
    }
}
