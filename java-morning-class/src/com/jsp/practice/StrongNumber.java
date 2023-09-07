package com.jsp.practice;

public class StrongNumber {
	public static String strongNumber(int n) {
		int temp=n;
		int sum=0;
		while(temp>0) {
			int last=temp%10;
		int fact=1;
		for(int i=1;i<=last;i++) {
			fact=fact*i;
		}
		sum=sum+fact;
		n=n/10;
		}
		if(sum==temp) {
			return "it is a strong number";
		}
		else {
			return "it is not a strong number";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(strongNumber(145));
		}
}
