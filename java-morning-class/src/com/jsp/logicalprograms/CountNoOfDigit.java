package com.jsp.logicalprograms;

public class CountNoOfDigit {
public static void main(String[] args) {
	int n=23242829;
	int count=0;
	while(n>0) {
		n=n/10;
		count++;
	}
	System.out.println(count);
}
}
