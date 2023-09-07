package com.jsp.practice;

public class Programs {
//	natural no
//public static void main(String[] args) {
//	for(int i=1;i<=100;i++) {
//		System.out.println(i);
//	}
//}
	
	
//	factors of a number
//	public static void factAre(int n) {
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				System.out.println(i);
//			}
//		}
//	}
//	public static void main(String[] args) {
//		factAre(15);
//	}
	
	
	//sum of natural number
//	public static int sumIs(int n) {
//		int sum=0;
//		for (int i=0;i<=n;i++) {
//			sum=sum+i;
//		}
//		return sum;
//	}
//	public static void main(String[] args) {
//		System.out.println(sumIs(20));
//	}
	
	
	//factorial of number
//	public static int factorialIs(int n) {
//		int pro=1;
//		for (int i=1;i<=n;i++) {
//			pro=pro*i;
//		}
//		return pro;	
//	}
//	public static void main(String[] args) {
//		System.out.println(factorialIs(5));
//	}

	
	//count digit in number
	
//	public static int countIs(int n) {
//		int count=0;
//		while(n>0) {
//			n=n/10;
//			count++;
//		}
//		return count;
//	}
//	public static void main(String[] args) {
//		System.out.println(countIs(232428));
//	}
	
	
	//swap no using 3rd variable
//	public static void main(String[] args) {
//		int a=20;
//		int b=40;
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println(a);
//		System.out.println(b);
//	}
//	
	
	//swap no without using 3rd variable
//	public static void main(String[] args) {
//		int a=24;
//		int b=27;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
//	}
	
	
	//prime no or not
//	public static boolean isPrime(int n) {
//		int count=0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println(isPrime(27));
//	}

	
	
	
//reversed number
//	public static int reversed(int n) {
//		int rev=0; 
//		for(int i=1;i<=n;i++) {
//			while(n>0) {
//				int temp2=n%10;
//				rev=rev*10+temp2;
//				n=n/10;
//			}
//		}
//		return rev;
//		}
//	public static void main(String[] args) {
//		System.out.println(reversed(2324289)); 
//	}
	
	
	
//	palidrome or not
//  public static boolean isPalidrome(int n) {
//	  
//	  int rev=0;
//	  int temp=n;
//		  while(n>0) {
//			  int temp2=n%10;
//			  rev=rev*10+temp2;
//			  n=n/10;
//		  }
//	  if(rev==temp) {
//		  return true;
//	  }
//	  else {
//		  return false;
//	  }
//	  
//  }
//  public static void main(String[] args) {
//	System.out.println( isPalidrome(1234321));
//  }
	
	
	//perfect no or not
//	public static boolean isPerfect(int n) {
//		int sum=0;
//		for (int i=1;i<n;i++) {
//	  if(n%i==0) {
//		  sum=sum+i;
//	  }
//	 }
//		if(sum==n) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println(isPerfect(28));
//	}
	
	
//	strong no or not
//	145=1!+4!+5!==145
//	public static boolean isStrongNo(int n) {
//		int temp=n;
//		int sum=0;
//		while(n>0) {
//			int lastDigit=n%10;
//		int pro=1;
//		for(int i=1;i<=lastDigit;i++) {
//			pro=pro*i;
//		}
//		sum=sum+pro;
//		n=n/10;
//	}
//		if(sum==temp) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println(isStrongNo(145));
//	}
	
	
	
//	neon no or not
//	9=9^2=9*9=81=8+1=9
//	public static String isNeon(int n) {
//		int square=n*n;
//		int sum=0;
//		while(square!=0) {
//			int last=square%10;
//		sum=last+sum;
//		square=square/10;
//	}
//		if(sum==n) {
//			return "it is neon no";
//			}
//		else {
//			return "it is not neon no";
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println(isNeon(9));
//	}
	
	
	
//	Xylem no or phloem no
	//1447=1+7(outer sum)==4+4(inner sum)=8==8
//	public static String isXylemOrPhloem(int n) {
//		int count1=0;
//		int count2=0;
//		int innersum=0;
//		int outersum=0;
//		int temp=n;
//while(temp>0) {
//	temp=temp/10;
//	count1++;
//}
//	while(n>0) {
//		int last=n%10;
//	if(count2==1 || count2==count1) {
//		outersum=outersum+last;
//	}
//	else {
//		innersum=innersum+last;	
//		}
//	n=n/10;
//	}
//	if(outersum==innersum) {
//		return "it it xylem no";
//	}
//	else {
//		return "it it phloem no";
//	}
//	}
//	public static void main(String[] args) {
//		System.out.println(isXylemOrPhloem(1447));
//	}
	
	
	
//	fibonacci no or not
//	public static void main(String[] args) {
//		int n=8;
//		int x=0;
//		int y=1;
//		int z=0;
//		while(z<=n)
//		System.out.println(z);
//		x=y;
//		y=z;
//		z=x+y;
//	}
//}
	


//Armstrong no or not
//	public static String isArmstrong(int n) {
//	int sum=0;
//	int z=n ;
//	int count=0;
//	while(z>0) {
//		z=z/10;
//		count++;
//	}
//	z=n;
//	while(z>0) {
//		int pro=1;
//		int last=z%10;
//		for(int i=1;i<=count;i++) {
//			pro=pro*last;
//		}
//		sum=sum+pro;
//		z=z/10;
//	}
//		if(sum==n) {
//			return "it is Armstrong no";
//		}
//		else {
//			return "it is not Armstrong no";
//		}
//	}
//	public static void main(String[] args) {
//		System.out.println(isArmstrong(153));
//	}
	
	
	
//	Disarium no or not
	
	public static boolean isDisarium(int n) {
		int sum=0;
		int count=0;
		int z=n;
		while(z>0) {
			z=z/10;
			count++;
		}
		z=n;
		while(z>0) {
			int pro=1;
			int last=z%10;
			for(int i=1;i<=count;i++) {
				pro=pro*last;
			}
			count--;
			sum=sum+pro;
			z=z/10;
			}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(isDisarium(175));
	}
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
