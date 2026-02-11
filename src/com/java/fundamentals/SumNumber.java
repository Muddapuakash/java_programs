package com.java.fundamentals;

public class SumNumber {

	public static void main(String[] args) {
		int N = -12345;
		int Sum=0;
		if(N<0) {
			N=-N;
		}else;
		while(N>0) {
			int LastDigit = N % 10;
			Sum = Sum + LastDigit;
			N = N/10;
		}
		System.out.println(Sum);

	}

}
