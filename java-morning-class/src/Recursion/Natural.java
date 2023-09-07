package Recursion;

public class Natural {
	public static void naturalno(int n) {
		if(n==0) {
			return;
		}
		naturalno(n-1);
		System.out.println(n);
	}
public static void main(String[] args) {
 naturalno(15);
}
}
