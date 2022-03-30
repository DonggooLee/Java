package org.ddongq.ex;

class Computer {
	
	// 필드
	private String model;
	private int price;
	
	// 생성자
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "모델 : " + model + ", 가격 : " + price + "만원";
	}

	@Override
	public boolean equals(Object obj) {	// 업캐스팅된다 Object obj = new Computer
		if(obj != null && obj instanceof Computer) {
			Computer com2 = (Computer)obj;
			return model.equals(com2.model) && price == com2.price;
//			return model.equals(((Computer)obj).model) && price==((Computer)obj).price;
		}else {
			return false;
		}
	}
	
}

public class Ex02_Object_equals {
	public static void main(String[] args) {
		
		Computer myCom1 = new Computer("그램", 150);
		Computer myCom2 = new Computer("그램", 150);
		
		// 1) Object의 equals : 객체 비교 불가
		// 2) Computer 클래스의 equals : 메소드 오버라이드
		if(myCom1.equals(myCom2)) {
			System.out.println("같은 컴퓨터이다.");
		}else {
			System.out.println("다른 컴퓨터이다.");
		}
		
		// == : 주소 비교 (new를 했기 때문에 주소를 비교한 것임) => CBV / CBR
		if(myCom1 == myCom2) {
			System.out.println("같은 컴퓨터이다.");
		}else {
			System.out.println("다른 컴퓨터이다.");
		}
		
	}
}
