package com.jsp.logicalprograms;

public class ArmstrongNo {
	//153=1*3+5*3+3*3=153
	public static boolean isArmstrongNo(int n) {
		int count=0; int sum=0; int temp=n;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=n;
		while(temp>0) {
			int last=temp%10;
			int fact=1;
			for(int i=1;i<=count;i++) {
				fact=fact*last;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if (sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	
public static void main(String[] args) {
	System.out.println(isArmstrongNo(153));
}
}
