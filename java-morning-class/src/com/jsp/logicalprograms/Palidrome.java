package com.jsp.logicalprograms;

public class Palidrome {
public static void main(String[] args) {
	int n=12321;
	int rev=0;
	int temp=n;
	while(n>0) {
		int temp2=n%10;
		rev=rev*10+temp2;
		n=n/10;
	}
	if(temp==rev) {
		System.out.println("it is palidrome");
	}
	else {
		System.out.println("it is not palidrome");
	}
}
}
