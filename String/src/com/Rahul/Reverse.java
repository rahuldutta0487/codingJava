package com.Rahul;

public class Reverse {
    public static void main(String[] args) {
        String x="Rahul";
        char[] y=x.toCharArray();
        int size=x.length();
        char[] a=new char[size];
        int i=0;
        while (i!=size){
            a[size-1-i]=y[i];
            i++;
        }
        System.out.println(y);
        System.out.println(a);

    }
}
