package org.ddongq.ex;

public class Ex03_LocalMain {
	public static void main(String[] args) {
		
		Ex03_Local person1 = new Ex03_Local("왕돼지", 30, "999999-1234567");
		Ex03_Local person2 = new Ex03_Local("피그킴", 35, "999999-5678912");
		Ex03_Local person3 = new Ex03_Local("PigKing", 25);

		person1.output();
		System.out.println("----------------------------");
		
		person2.output();
		System.out.println("----------------------------");
		
		person3.output();

	}
}
