package Constructors.com;

public class PenDriver {
	public static void main(String[] args) {
		Pen pen =new Pen();//constructor calling statement
		//it calls default constructor
		System.out.println(pen.name);
		pen.name="camlin";
		System.out.println(pen.name);
			
		
	}

}
