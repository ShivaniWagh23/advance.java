package com.jsp.collection;

import java.util.ArrayList;

public class Array1 {
	public class Array{
		public static void main(String[] args) {
			ArrayList al=new ArrayList();
			al.add(25);
			al.add(27);
			al.add(24);
			al.add(29);
			System.out.println(al);
			ArrayList al2=new ArrayList();
			al2.add(230);
			al2.add(37);
			al2.add(97);
			al2.addAll(al);
			System.out.println(al2);
			al2.remove(3);
			System.out.println(al2);
			al2.retainAll(al);
			System.out.println(al2
					);
			al2.removeAll(al2);
			System.out.println(al2);
			al2.clear();
		System.out.println(al2);



		}
		}
}
