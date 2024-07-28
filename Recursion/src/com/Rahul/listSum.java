package com.Rahul;

import java.util.List;

public class listSum {
    public static void main(String[] args) {

    }
    public int pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int maxi=Integer.MIN_VALUE;
        int  sum=0;
        for(int i=0;i<arr.size(); i++){
            sum +=arr.get(i);
            if(sum > maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;

    }
}
