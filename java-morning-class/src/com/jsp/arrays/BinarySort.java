package com.jsp.arrays;

public class BinarySort {
	public static void binarySearch(int arr[],int key) {
		int low =0; int high = arr.length-1;
		while(low<=high) {
			int mid = (low+ high)/2;
			if(arr[mid]==key) {
				System.out.println(mid);
				break;
			}
			else
				if (arr[mid]>key) {
					high = mid-1;
				}else
					if (arr[mid]<key) {
						low = mid+1;
					}
		}
		System.out.println("element not found.");
	}
	public static void main(String[] args) {
		int arr[] = {2,16,17,18,19,20,27};
		
		binarySearch(arr, 17);
	}
}
