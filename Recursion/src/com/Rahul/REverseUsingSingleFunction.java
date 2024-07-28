package com.Rahul;

import java.util.Arrays;

public class REverseUsingSingleFunction {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        reiv(arr,0);
        System.out.println(Arrays.toString(arr));
    }

    static void reiv( int[]  arr,int i){
        int n=arr.length;
        if(i>n/2){
            return;
        } else {
            arr[i]=arr[n-i-1];
            reiv(arr,i+1);
        }
    }

}
