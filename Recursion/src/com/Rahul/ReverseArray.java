package com.Rahul;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        reverse(arr,0,6);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr, int s, int e){
        if(s==e){
            return;
        } else {
            swap(arr, s, e);
            reverse(arr,s+1,e-1);
        }

    }

    static void swap(int[] arr,int integer1, int integer2){
        int temp=arr[integer1];
        arr[integer1]=arr[integer2];
        arr[integer2]=temp;

    }

}
