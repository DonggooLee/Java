package org.ddongq.ex;

public class Ex04_Triangle {
	
	// 필드
	int width;
	int height;
	
	// 메소드
	void setFields(int w, int h) {
		width = w;
		height = h;
	}
	
//	아래 두 메소드가 오버로딩 되지 않는 이유 ?
//	메소드 명은 같으나, 매개변수가 다르지 않다(리턴타입은 상관 없음)
	int calcArea() {
		return width * height / 2;
	}
	
//	double calcArea() {
//		return width * height / 2.0;
//	}
	
	void info() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
	
	public static void main(String[] args) {
		Ex04_Triangle semo = new Ex04_Triangle();
		semo.setFields(6, 5);
		semo.info();
	}
	
}
