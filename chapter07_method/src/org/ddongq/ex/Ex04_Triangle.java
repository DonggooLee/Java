package org.ddongq.ex;

public class Ex04_Triangle {
	int width;
	int height;
	
	void setFields(int w, int h) {
		width = w;
		height = h;
	}
	
	// 아래 두 메소드가 오버로딩 되지 않는 이유
	// 메소드 명은 같으나, 매개변수가 다르지 않다(리턴타입은 상관 없음)
	int calcArea() {
		return width * height / 2;
	}
	
	double calcArea() {
		return width * height / 2.0;
	}
	
}
