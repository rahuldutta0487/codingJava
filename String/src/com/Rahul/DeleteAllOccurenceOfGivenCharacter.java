package com.Rahul;

 public class DeleteAllOccurenceOfGivenCharacter {
    public static void main(String[] args) {
        String x = "SPIDERSLIES";
        char[] y = x.toCharArray();
        int size = x.length();
        char key = 'S';  // Use uppercase 'S' to match the characters in the string

        int i = 0;

        StringBuilder res = new StringBuilder();
        while (i != size) {
            if (y[i] != key) {
                res.append(y[i]);
            }
            i++;
        }
        System.out.println(res.toString());
    }
}
