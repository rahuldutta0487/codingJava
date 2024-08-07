package com.Rahul;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String x="Rahul";
        char[] y=x.toCharArray();
        int size=x.length();
        char[] a=new char[size];
        int i=0;
        while (i!=size){
            a[i]=y[i];
            i++;
        }
        System.out.println(y);
        System.out.println(a);
    }
}