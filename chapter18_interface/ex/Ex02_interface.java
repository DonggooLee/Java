package org.ddongq.ex;

interface Shape {
	
	double PI = 3.141592;	// public static double PI
	double calcArea();		// public abstract double calcArea();
	void output();			// public abstract void output();
	
}

class Rect implements Shape {
	
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return width * height;
	}

	@Override
	public void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
	
}

class Circle implements Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return PI * Math.pow(radius, 2);
	}

	@Override
	public void output() {
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
	}

}

public class Ex02_interface {
	public static void main(String[] args) {
		
		Shape rect = new Rect(10,30); 	// 업캐스팅
		rect.output();
		
		Shape cir = new Circle(15);		// 업캐스팅
		cir.output();
		
	}
}
