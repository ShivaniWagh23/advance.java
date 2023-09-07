package com.jsp.logicalprograms;

public class XylemPhloem {
	//1526=innersum==outersum
	public static String isXylemOrPhloemNo(int n) {
		int temp=n;
		int sum1=0; int sum2=0;
		int count1=0; int count2=0;
		while(temp>0) {
			temp=temp/10;
			count1++;
		}
		temp=n;
		while(temp>0) {
			 int lastd=temp%10;
			 count2++;
		if(count2==count1||count2==1) {
			sum1=sum1+lastd;
		}
		else {
			sum2=sum2+lastd;
		}
		temp=temp/10;
		}
		if (sum1==sum2) {
			return "it is a Xylem";
		}
		else {
			return "it is Phloem";
		}
	}
	
public static void main(String[] args) {
	System.out.println(isXylemOrPhloemNo(1425));
}
}
