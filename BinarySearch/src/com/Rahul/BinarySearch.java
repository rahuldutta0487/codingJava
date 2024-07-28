package com.Rahul;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinarySearch {
    public static void main(String[] args) {
      int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binasearch(arr,7));
    }

    static int binasearch(int[] arr, int targetelement){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start+(end-start) / 2;

            if(targetelement < arr[mid]){
                end= mid-1;
            } else if (targetelement > arr[mid]) {
                start= mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}