package com.Rahul;

public class RotatedBinarySearch {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr,5,0,arr.length-1));
    }

    static int search(int[] arr , int target, int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<= arr[m]){
            if(target>= s  && target<=m){
                return search(arr,target,s,m-1);
            } else {
                return search(arr,target,m+1,e);
            }
        }
        if(target>=arr[m] && target<=arr[e]){
            return search(arr,target,m+1,e);
        } else {
            return search(arr,target,s,m-1);
        }
    }
}
