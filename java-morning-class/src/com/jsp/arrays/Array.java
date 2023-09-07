package com.jsp.arrays;


public class Array {
	
	public static int searchElement(int arr[],int key) {
		
		for(int i=0;i<=arr.length-1;i++) {
			if (arr[i]==key) {
				return 1;
			}
	}
	
	return key;
		
	}
public static void main(String[] args) {
	int arr[]= {23,27,20,18,17,16,2};
	System.out.println(searchElement(arr,17));
	}



}

