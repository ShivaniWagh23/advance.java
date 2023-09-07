package com.jsp.decision;

public class Largest {
public static void main (String args[]) {
	int a=10;
	int b=15;
	int c=45;
	if(a>b && a>c) {
		System.out.println(a + "is the greatest");
	}
	else
	if(b>c){
		System.out.println(b + "is the greatest");
	}
	else
	{
		System.out.println(c + "is the greatest");
}
}
}