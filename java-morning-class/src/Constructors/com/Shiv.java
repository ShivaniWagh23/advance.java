package Constructors.com;

public class Shiv {
    String name;
	static String Mother;
	String Father;
	int age;
	public  Shiv(String name,String father,int age){
		this.name=name;
		this.Father=father;
		this.age=age;
		System.out.println("NSI is called 1st");
	}
	public Shiv(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("NSI is called 2nd");
	}
	

}
