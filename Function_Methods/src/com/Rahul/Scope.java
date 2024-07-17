package com.Rahul;

public class Scope {
    public static void main(String[] args) {
        int a=20;
        int b= 40;

        {
//             int a=54;// once initilaised outside the block cant initialised again
            a=90;//but can change the value (reassign the original reference variable)
            int c = 32;
            System.out.println(a);
        } // values initialised in this block will stay in this block
          // Block scope
//        System.out.println(c);// cannot use outside the box



        // Scoping in for loop
        for (int i = 0; i < 8; i++) {
            System.out.println(i);

        }
//        System.out.println(i);//cannot do that

    }
}
