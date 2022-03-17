package org.ddongq.test;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(DataClass.str.size());
		
		new DataClass();
		System.out.println(DataClass.str.size());
		
		OperClass.sum();
		
		System.out.println(OperClass.PI);
		
	}
}
