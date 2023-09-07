package com.jsp.practice;

public class CountNoOfDigits {
public static void toCountNoOfDigits(int n) {
	int count=0;
	while(n>0) {
	 n=n/10;	
	count++;
	}
	System.out.println(count);
	
	
	
}

	public static void main(String[] args) {
		toCountNoOfDigits(1235845);
	}
}
