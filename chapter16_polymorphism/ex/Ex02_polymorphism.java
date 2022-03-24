package org.ddongq.ex;

class Shape {
	// 메소드 (부모입장에서 의미없음: 자식들이 사용하기 위해 만든 만듦)
	public double calcArea() {
		return 0;	// 에러 안나가게 하려고 만든 임시값 어떤 값이 들어가도 의미가 없다 
	}
}

class Rect extends Shape {
	// 필드
	private int width, height;
	// 생성자
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	// 메소드
	@Override
	public double calcArea() {
		return width * height;
	}
}

class Triangle extends Shape {
	// 필드
	private int width, height;
	// 생성자
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	// 메소드
	@Override
	public double calcArea() {
		return (width * height) / 2.0;
	}
}

class Circle extends Shape {
	// 필드
	private double radius;
	// 생성자
	public Circle(double radius) {
		this.radius = radius;
	}
	// 메소드
	@Override
	public double calcArea() {
//		return Math.PI * radius * radius;
		return Math.PI * Math.pow(radius, 2);
	}
}

public class Ex02_polymorphism {
	public static void main(String[] args) {
		
		Shape[] arr = new Shape[3];
		
		arr[0] = new Rect(1, 5);
		arr[1] = new Triangle(5, 8);
		arr[2] = new Circle(3);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].calcArea());
		}
		
	}
}
