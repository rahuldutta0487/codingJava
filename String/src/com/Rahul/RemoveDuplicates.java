package com.Rahul;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String x="SILLYSPIDERS";
        char[] y=x.toCharArray();
        int size= y.length;

        Map<Character,Integer> map=new LinkedHashMap<>();
        int i=0;
        while (i != size){
            if(map.containsKey(y[i])==false){
                map.put(y[i],1);
            } else {
                int oldval=map.get(y[i]);
                int newval=oldval+1;
                map.put(y[i],newval);
            }
            i++;
        }
        Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
        String res="";
        for(Map.Entry<Character,Integer> data:hmap){
            if(data.getValue()>=1)

                res += data.getKey();
            }
        System.out.println(res);
        }

    }

