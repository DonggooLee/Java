package org.ddongq.test2;

public class CarMain {
	public static void main(String[] args) {
		
		Car car_1 = new Car("BMW", "RED");
		car_1.output();
		
		System.out.println("------------------");
		
		Car car_2 = new Car("KIA", "DARK", 2002);
		car_2.output();
		
	}
}
