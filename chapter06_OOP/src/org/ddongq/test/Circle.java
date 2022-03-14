package org.ddongq.test;

public class Circle {
	// 변수(필드)
	double radius;
	static final double PI = 3.141592; //값이 변할게 없을때에는 final // 공용데이터로 사용 static
	String name;
	
	// 메소드
	void info() {
		System.out.println("반지름 : " + radius);
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + (PI * radius * radius));
		System.out.println("둘레 : " + (2 * PI * radius));
	}
	
}
