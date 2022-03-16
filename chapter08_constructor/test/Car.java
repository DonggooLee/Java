package org.ddongq.test;

import java.util.Calendar;

public class Car {
	/*
	    Q1.
		Car.java				
			필드 -String model, String color, int year, booleans isNewCar
			메소드 - Constructor, output
		CarMain.java
			★ 생성자(모델, 색상, 연식) / 생성자(모델, 색상)
			Calendar calendar = Calendar.getInstance();
			calendar.get(Calendar.YEAR);
	 */
	
	String model, color;
	int year;
	boolean isNewCar;
	
	public Car() {

	}
	
	public Car(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
		Calendar calendar = Calendar.getInstance();
		isNewCar = (this.year==calendar.get(Calendar.YEAR) ? true : false);
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		isNewCar = true;
	}
	
	void output() {
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("연식 : " + year);
		System.out.println("신형? : " + (isNewCar ? "신형" : "구형"));
	}
	
}
