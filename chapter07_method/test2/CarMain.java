package org.ddongq.test2;

public class CarMain {
	public static void main(String[] args) {
		
		Car car_1 = new Car();
		car_1.setFields("BMW", "RED");
		car_1.output();
		
		System.out.println("---------------");
		
		Car car_2 = new Car();
		car_2.setFields("KIA", "BLUE", 1999);
		car_2.output();
		
	}
}
