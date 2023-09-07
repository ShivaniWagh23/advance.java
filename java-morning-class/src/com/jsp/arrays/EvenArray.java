package com.jsp.arrays;

public class EvenArray {
	public static int evencount(int arr[]) {
		int even_count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even_count++;
			}
		}
		return even_count;
	}
	
	
public static void main(String[] args) {
	int arr[]= {21,58,62,79,22,10,87,29};
	System.out.println(evencount(arr));
			
	
}
}
