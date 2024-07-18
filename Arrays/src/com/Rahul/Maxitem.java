package com.Rahul;

public class Maxitem {
    public static void main(String[] args) {
        int[] arr={ 3,8,2,1,54,6};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,2,5));
    }
    static int maxRange(int[] arr,int start, int end){
        int maxVal=arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;
    }
    static int max(int[] arr){
        int maxVal=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }

        }
        return maxVal;
    }
}
