package com.java.fundamentals;

public class ReverseNumber {

	public static void main(String[] args) {
		int N = 1532;
		int Rev=0;
		while(N>0) {
			int LastDigit = N%10;
			Rev =Rev * 10+LastDigit;
			N=N/10;
			
		}
		System.out.println(Rev);

	}

}
