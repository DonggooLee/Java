package org.ddongq.test;

public class CarMain {
	public static void main(String[] args) {
		
		Car car = new Car();
		car.setFields("bmw", "Red");
		car.output();
		
		Car car_y = new Car();
		car_y.setFields("BMW", "RED", 1664);
		car_y.output();
		
	}
}
