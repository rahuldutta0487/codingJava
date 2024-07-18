package com.Rahul;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int integer1, int integer2){
        int temp=arr[integer1];
        arr[integer1]=arr[integer2];
        arr[integer2]=temp;

    }
}
