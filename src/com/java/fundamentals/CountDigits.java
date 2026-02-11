package com.java.fundamentals;

import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int N = scan.nextInt();
		int Count = 0;
		while(N>0) {
			int LastDigit = N % 10;
			Count++;
			N = N/10;
		}
		System.out.println(Count);
		

	}

}
