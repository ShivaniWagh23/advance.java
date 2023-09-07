package com.jsp.logicalprograms;

public class ReverseNumber {
public static void main(String[] args) {
	int rev=0;
	int n=14296;
	while(n>0) {
		int temp=n%10;
		rev= rev*10+temp;
		n=n/10;
	}
	System.out.println(rev);
}
}
