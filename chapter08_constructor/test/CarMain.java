package org.ddongq.test;

public class CarMain {
	public static void main(String[] args) {
		
		Car test_1 = new Car("BMW", "RED");
		test_1.output();
		
		System.out.println("---------------");
		
		Car test_2 = new Car("BMW", "BLACK", 1989);
		test_2.output();
		
	}
}
