package org.ddongq.ex;

class Product{
	public void info() {
		System.out.println("Product");
	}
}

class Computer extends Product{
	@Override
	public void info() {
		System.out.println("Computer");
	}
}

class Notebook extends Product{
	@Override
	public void info() {
		System.out.println("Notebook");
	}
}

public class Ex01_polymorphism {
	public static void main(String[] args) {
		
		Computer[] computers = new Computer[10];
		Notebook[] notebooks = new Notebook[10];
		
		for(int i=0; i<computers.length; i++) {
			computers[i] = new Computer();
		}
		
		for(int i=0; i<notebooks.length; i++) {
			notebooks[i] = new Notebook();
		}

		// -------------------------------- 업캐스팅 이용
		
		Product[] products = new Product[20];  // 배열 생성 인스턴스 생성 X
//		products[0] = new Product(); 문법에 문제 X 그러나 존재하면 안되는 코드(무슨제품인지 모름)
		products[0] = new Computer(); // 부모배열에 자식 객체를 생성
		products[1] = new Computer(); 
		products[2] = new Notebook(); 
		
		products[0].info();
		products[1].info();
		products[2].info();
		
	}
}
