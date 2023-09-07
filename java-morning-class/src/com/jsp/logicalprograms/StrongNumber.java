package com.jsp.logicalprograms;

public class StrongNumber {
//145=1!+4!+5!=1+1*2*3*4*+1*2*3*4*5=145
	
	public static boolean isStrongNo(int n) {
		int sum=0;int z=n;
		while(z>0) {
		int	temp=z%10;
		int fact=1;
			for(int i=1;i<=temp;i++) {
			fact=fact*i;
			}
		sum=sum+fact;
		z=z/10;
		}
	if(sum==n){
		return true;
	}
	else {
		return false;
	}
	}
	
	public static void main(String[] args) {
		System.out.println(isStrongNo(145));
	}
}
