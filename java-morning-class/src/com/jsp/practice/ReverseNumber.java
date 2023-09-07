package com.jsp.practice;

public class ReverseNumber {
		public static void reverseNumber(int n){
		int rev=0;
		while(n>0){
		int temp=n%10;
		rev=rev*10+temp;
		n=n/10;
		}
		System.out.println(rev);
		}
		
		
		public static void main(String [] args){
		reverseNumber(1254833);
		}
		
}


