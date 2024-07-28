package com.Rahul;

import java.util.ArrayList;

public class FinElements {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,6,8,9};
        System.out.println(findint(arr,6,0));
        System.out.println(findAllint(arr,6,0,new ArrayList<>()));
    }

    static boolean find(int[] arr,int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }

    static int findint(int[] arr,int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
         return  findint(arr,target,index+1);
    }
    static ArrayList<Integer> findAllint(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllint(arr, target,index+1,list);
    }

    static ArrayList<Integer> findAllint2(int[] arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();

        if(index==arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=findAllint2(arr, target,index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
