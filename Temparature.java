package com.Rahul;

import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temparature in Celcius: ");


        float temp= input.nextFloat();
        float tempc = (temp* 9/5) + 32;

        System.out.println(tempc);
    }
}
