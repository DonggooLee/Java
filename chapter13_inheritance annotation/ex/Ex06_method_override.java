package org.ddongq.ex;

class Expresso{
	String origin;
	// 생성자
	public Expresso() {
	}
	public Expresso(String origin) {
		this.origin = origin;
	}
	// 메소드
	void taste() {
		System.out.println("쓰고, 진하다");
	}
}

class Latte extends Expresso{
	String milk;
	// 생성자
	public Latte() {
	}
	public Latte(String origin, String milk) {
		super(origin);
		this.milk = milk;
	}
	/*
	 * @Override
	 *  - 개발자로 하여금 상위 클래스의 어떤 메소드를 오버라이드 했는지 개발적 인지가 가능
	 *  - 상위 클래스의 매소드의 시그니처 변경시 자식 클래스의 오버라이드 받은 메소드와
	 *    상이함에 따른 문제를 컴파일 단계에서 인지
	 */
	@Override
	void taste() {
		System.out.println("원산지 : "+ origin +", 우유 :" + milk);
		System.out.println("부드럽다");
	}
	
}

public class Ex06_method_override {
	public static void main(String[] args) {
		Latte coffee = new Latte("콜롬비아", "서울우유");
		coffee.taste();
	}
}













