package com.jsp.arrays;

public class ElementSum {
	public static int sumOfElement(int a[]) {
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	return sum;
	}
	
public static void main(String[] args) {
	int a[]= {1,2,8,9,6,7,3};
	System.out.println(sumOfElement(a));
}
}
