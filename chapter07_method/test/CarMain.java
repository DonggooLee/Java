package org.ddongq.test;

public class CarMain {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		Car yourCar = new Car();
		myCar.setFields("GENESIS", "BLUE");
		yourCar.setFields("BMW", "RED", 1664);
		
		myCar.output();
		System.out.println("-------------");
		yourCar.output();
		
	}
}
