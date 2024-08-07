package com.Rahul;

public class Uppercase {
    public static void main(String[] args) {
        String str="rahul";
        char[] a=str.toCharArray();
        int size=str.length();

        int i=0;
        while (i!=size){
            a[i]=(char)(a[i]-32);
            i++;
        }
//        str=str.toUpperCase();
        System.out.println(str);
        System.out.println(a);
    }
}
