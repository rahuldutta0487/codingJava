package com.Rahul;

public class CountVowelConsonentSpecialcar {
    public static void main(String[] args) {
        String x="RahuuL DUTTA";
        x=x.toUpperCase();
        char[] y=x.toCharArray();
        int size=y.length;

        int conv=0;
        int conso=0;
        int specnt=0;

        int i=0;

        while(i!=size){
            if(y[i]>='A' && y[i]<='Z'){
                if(y[i]=='A' || y[i]=='E' || y[i]=='I'|| y[i]=='o' ||y[i]=='u'){
                    conv++;
                }
                else {
                    conso++;
                }
            }
            else {
                specnt++;
            }
            i++;
        }
        System.out.println("Vowel Count"+conv);
        System.out.println("Consonent count" + conso);
        System.out.println("Special Character" + specnt);
        System.out.println(x);
    }
}
