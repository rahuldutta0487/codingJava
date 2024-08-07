package com.Rahul;

public class UppercaseFirsrLetterOfWords {
    public static void main(String[] args) {
        String str="aradhye brillance bwkhjd";
        char[] a=str.toCharArray();
        int size=str.length();
        a[0]=(char)(a[0]-32);

        int i=1;
        while (i!=size){
            if(a[i]== ' '){
                a[i+1]=(char)(a[i+1]-32);
                i++;
            }
        }
        System.out.println(str);
        System.out.println(a);
    }
}
