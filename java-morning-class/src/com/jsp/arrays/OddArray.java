package com.jsp.arrays;

public class OddArray {
	public static int countOdd( int arr[]) {
		int odd_count=0;
		for(int i=0;i<arr.length;i++) {
			if(!(arr[i]%2==0)){
				odd_count++;
			}
			}
		return odd_count ;
	}
	
	
public static void main(String[] args) {
	int arr[]= {40,21,7,95,32,74};
	System.out.println(countOdd(arr));

}
}
