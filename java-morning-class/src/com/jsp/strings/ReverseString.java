package com.jsp.strings;

public class ReverseString {
public static void main(String[] args) {
	String s="Hello Good Morning";
	String rev=" ";
	for(int i=0;i<s.length();i++) {
		rev=s.charAt(i)+rev;
	}
	System.out.println(rev);
}
}
