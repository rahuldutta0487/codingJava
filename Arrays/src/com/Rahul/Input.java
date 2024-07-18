package com.Rahul;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // array of premitives
        int[] arr=new int[5];
//        arr[0]=21;
//        arr[1]=89;
//
//        System.out.println(arr[1]);

        //input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println(Arrays.toString(arr));

        // array of objects
        String[] str=new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]= in.next();


        }
        System.out.println(Arrays.toString(str));


    }
}
