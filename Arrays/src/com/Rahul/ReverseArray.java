package com.Rahul;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,54};
        reverse(arr);
    }

    static void reverse(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }


}
