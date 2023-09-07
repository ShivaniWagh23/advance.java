package com.jsp.practice;

public class SumOfNaturalNumbers {
	public static void toPrintSumOfNaturalNumbers(int n){
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		toPrintSumOfNaturalNumbers(5);
	}

}
