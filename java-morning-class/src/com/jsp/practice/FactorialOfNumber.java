package com.jsp.practice;


public class FactorialOfNumber {
	public static int toPrintFactorialOfNumber(int n){
	int pro=1;
	for(int i=1;i<=n;i++) {
		pro=pro*i;
	}
	return pro;
	}
	public static void main(String[] args) {
		System.out.println(toPrintFactorialOfNumber(5));
	}
	}
