package com.Rahul;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit= in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("king of fruit");
            case "Apple" -> System.out.println("switter one");
            case "Orange" -> System.out.println("Round fruit");
            default -> System.out.println("i dont know");
        }

    }
}