package Constructors.com;

public class StaticDriver {
public static void main(String[] args) {
	//calling a static method by its class name
	Static.addTwoNumbers(23, 28);
	//calling static method by its object reference
	Static s = new Static();
	int r=s.subTwoNumbers(28, 24);
	System.out.println(r);
	//calling non static method of void type by its object reference
	s.divTwoNumbers(28, 9);
	//calling non  static method by its object reference
	int pro=s.mulTwoNumbers(23, 28);
	System.out.println(pro+"is the product of two no ");
}
}
