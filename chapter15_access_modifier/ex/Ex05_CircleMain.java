package org.ddongq.ex;

public class Ex05_CircleMain {
	public static void main(String[] args) {
		Ex05_Circle circle1 = new Ex05_Circle();
		Ex05_Circle circle2 = new Ex05_Circle(1.5);
		Ex05_Circle circle3 = new Ex05_Circle(3, 3, 2.5);

		circle1.output();
		System.out.println();
		circle2.output();
		System.out.println();
		circle3.output();
	}
}
