package org.ddongq.ex;

import java.util.Arrays;

// 음식만 담을 수 있는 바구니를 구현해 보자! (디테일 하게 넣지 말구 상속 받는 형태만 보자!)
class Basket <T> {
	
	private T[] foods;

	// 생성자 -> 배열 크기 선언
	@SuppressWarnings("unchecked")
	public Basket(int len) {
		foods = (T[])(new Object[len]);
	}
	
	// add(T food) -> 비어있는 배열에 음식저장
	public void add(T food) {
		for(int i=0; i<foods.length; i++ ) {
			if(foods[i]==null){
				foods[i] = food;
				break;
			}
		}
	}
	
	// getFoods() -> 음식배열 리턴
	public T[] getFoods() {
		return foods;
	}
	
}

class Food {
	private String a;

	public Food(String a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return a;
	}
}

class Apple extends Food {

	public Apple(String a) {
		super(a);
	}
	
}

class Banana extends Food {

	public Banana(String a) {
		super(a);
	}
	
}

class Bread extends Food {

	public Bread(String a) {
		super(a);
	}
	
}

class Computer {}

public class Ex06_generic {
	public static void main(String[] args) {
		// 바스켓에 각 과일들 넣고
		// 바스켓에 담긴 과일들 줄력
		
		Basket<Food> basket = new Basket<>(5);	// <부모클래스>를 넣었기 때문에 업캐스팅 통해서 효율적으로 사용가능
		
		basket.add(new Apple("사과"));	// 부모타입으로 자식들이 들어가는 업캐스팅
		basket.add(new Banana("바나나"));
		basket.add(new Bread("빵"));
		basket.add(new Banana("바나나"));
		basket.add(new Apple("사과"));
		basket.add(new Apple("사과"));
		basket.add(new Apple("사과"));
		basket.add(new Apple("사과"));
		basket.add(new Apple("사과"));
		basket.add(new Apple("사과"));
		basket.add(new Apple("사과"));
		basket.add(new Apple("사과"));
//		basket.add(new Computer());		실행 불가 업캐스팅이 불가하기 때문
//		Food food = new Computer();		성립 X (추상클래스는 무조건 상속받아야 한다)
		
		System.out.println(Arrays.toString(basket.getFoods()));
		
	}
}
