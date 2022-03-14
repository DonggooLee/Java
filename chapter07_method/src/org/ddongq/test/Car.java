package org.ddongq.test;

import java.util.Calendar;

public class Car {
	String model; 
	String color;
	int year;
	
	Calendar calendar = Calendar.getInstance();
	
	void setFields(String _model, String _color) {
		model = _model;
		color = _color;
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
	}
	
	void setFields(String _model, String _color, int _year) {
		model = _model;
		color = _color;
		year = _year;
	}
	
	void output() {
		System.out.println("차 모델 : " + model);
		System.out.println("차 색상 : " + color);
		System.out.println("차 연식 : " + year);
	}
	
}
