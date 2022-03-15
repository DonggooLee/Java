package org.ddongq.ex;

public class Ex03_CircleMain {
	public static void main(String[] args) {
		Ex03_Circle circle_1 = new Ex03_Circle();
		circle_1.output();
		
		System.out.println("----------------------");
		
		Ex03_Circle circle_2 = new Ex03_Circle(3);
		circle_2.output();
		
		System.out.println("----------------------");

		Ex03_Circle circle_3 = new Ex03_Circle(3,5,3);
		circle_3.output();
	}
}
