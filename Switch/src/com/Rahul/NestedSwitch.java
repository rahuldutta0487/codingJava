package com.Rahul;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int empId= in.nextInt();
        String department= in.next();

        switch (empId) {
            case 1 -> System.out.println("rahul dutta");
            case 2 -> System.out.println("kunal kushwa");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("it ddepartment");
                    default -> System.out.println("all othres");
                }
            }
        }
    }
}
