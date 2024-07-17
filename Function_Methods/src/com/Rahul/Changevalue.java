package com.Rahul;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr={1,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] num){
        num[0]=99;

    }
}
