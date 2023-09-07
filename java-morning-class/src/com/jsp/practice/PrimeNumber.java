package com.jsp.practice;

public class PrimeNumber {
	public static void toCheckPrimeNo(int n){
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
			}
		if(count==2) {
			System.out.println("it is prime no");
		}
		else {
			System.out.println("it is not prime no");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		toCheckPrimeNo(5);
	}

}
