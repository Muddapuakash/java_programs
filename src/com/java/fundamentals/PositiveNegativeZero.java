package com.java.fundamentals;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println("The Given NUmber " + N + " is Zero");
        } else if (N > 0) {
            System.out.println("The Given NUmber " + N + " is Positive");
        } else {
            System.out.println("The Given NUmber " + N + " is Negative");
        }
        sc.close();
    }
}
