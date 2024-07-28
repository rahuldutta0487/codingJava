package com.Rahul;

public class OrderagnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr={ 1,3,4,6,7,8,9,10};
        System.out.println(ordediagonistic(arr,9));
    }

    static int ordediagonistic(int[] arr, int targetelement){
        int start=0;
        int end=arr.length-1;
        boolean isAcn;
        if(arr[start] < arr[end]){
            isAcn= true;
        } else {
            isAcn= false;
        }

        while(start<=end){
            int mid= start+(end-start) / 2;
        if(arr[mid] == targetelement){
            return mid;
        }
        if(isAcn){
            if(targetelement < arr[mid]){
                end= mid-1;
            } else if (targetelement > arr[mid]) {
                start= mid+1;
            }
        } else {
            if(targetelement > arr[mid]){
                end= mid-1;
            } else if (targetelement < arr[mid]) {
                start= mid+1;
            }
        }
        }
        return -1;

    }
}
