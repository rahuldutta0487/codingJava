package com.Rahul;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list=new ArrayList<>(10);
//        list.add(23);
//        list.add(33);
//        list.add(234);
//        list.add(235);
//        System.out.println(list);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //output
        System.out.println(list);

    }
}
