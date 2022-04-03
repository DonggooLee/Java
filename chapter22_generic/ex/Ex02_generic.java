package org.ddongq.ex;

class Bag <T> {	// <T> : 자료형  ex) int 형을 사용하고 싶으면 Integer를 써야된다
	
	// 필드
	private T obj;

	// 메소드
	public T getObj() {
		return obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
}

// 담을 물건들
class Ball {}
class Pen {}

public class Ex02_generic {
	public static void main(String[] args) {
		
		// 아래 두가지 모두 가능
		// Bag<Ball> bag = new Bag<Ball>();
		Bag<Ball> bag = new Bag<>();	// <>안에 Ball을 넣어도 되고, 빼도된다.
		bag.setObj(new Ball());
		Ball ball = bag.getObj();		// 제네릭을 사용하면 캐스팅이 필요없다.
		System.out.println(ball);
		
	}
}
