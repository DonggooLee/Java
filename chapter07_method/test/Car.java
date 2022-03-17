package org.ddongq.test;

import java.util.Calendar;

public class Car {
	/*
	 	Q1. 
		클래스 Car를 정의하시오.
		- 필드 : String model,String color, int year
		- 메소드 : setFields(model, color) : 올해를 year로 처리, setFields(model, color, year)
			   	 output
		클래스 CarMain을 정의 하시오.
	 */

	// 필드
	String model, color;
	int year;

	// 메소드
	void setFields(String _model, String _color) {
		model = _model;
		color = _color;
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
	}

	void setFields(String _model, String _color, int _year) {
		setFields(_model, _color);
		year = _year;
	}

	void output() {
		System.out.println("차 모델 : " + model);
		System.out.println("차 색상 : " + color);
		System.out.println("차 연식 : " + year);
	}

}
