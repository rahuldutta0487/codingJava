package com.Rahul;


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={12,34,5,65,76,8,96};
        int ans=linearsearch(arr,8);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
               return index;
            }
        }
        return -1;
    }
}