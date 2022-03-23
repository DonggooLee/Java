package org.ddongq.test2;

import java.util.Calendar;

public class Car {
	
	/*
	Q1.
	Car.java			필드 -String model, String color, int year, booleans isNewCar
						메소드 - Constructor, output
	CarMain.java
	★
	생성자(모델, 색상, 연식) / 생성자(모델, 색상)
	Calendar calendar = Calendar.getInstance();
	calendar.get(Calendar.YEAR);
	*/
	
	// 필드
	Calendar calendar = Calendar.getInstance();
	String model, cololr;
	int year;
	boolean isNewCar;
	
	// 생성자
	public Car() {}

	public Car(String model, String cololr, int year) {
		this.model = model;
		this.cololr = cololr;
		this.year = year;
		isNewCar = (year==calendar.get(Calendar.YEAR) ? true : false);
	}
	
	public Car(String model, String cololr) {
		this.model = model;
		this.cololr = cololr;
		year = calendar.get(Calendar.YEAR);
		isNewCar = true;
	}
	
	// 메소드
	void output() {
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + cololr);
		System.out.println("연식 : " + year);
		System.out.println("신차? : " + (isNewCar ? "신식" : "구형"));
	}
	
}
