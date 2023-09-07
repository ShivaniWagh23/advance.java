package Constructors.com;

public class Static {
//static void type
	public static void addTwoNumbers(int num1,int num2)
	{
		int res=num1+num2;
		System.out.println(res);
	}
	//static and return type
	public int subTwoNumbers(int num1,int num2)
	{
		int res=num1-num2;
		return res;
	}
	//non static and void type
	public void divTwoNumbers(int num1,int num2)
	{
		System.out.println(num1/num2);
	}
	//non static and return type
	public int mulTwoNumbers(int num1,int num2)
	{
		return num1*num2;
	}
}
