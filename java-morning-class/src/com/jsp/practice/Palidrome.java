package com.jsp.practice;

public class Palidrome {
	public static boolean palidromOrNot(int n) {
		int rev=0;
		int temp=n;
		while(n>0) {
			int temp2=n%10;
			rev=rev*10+temp2;
			n=n/10;
		}
		if(rev==temp) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(palidromOrNot(1234325));
	}

}
