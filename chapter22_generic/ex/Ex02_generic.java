package org.ddongq.ex;

class Bag <T> {				// <T> : 자료형  ex) int 형을 사용하고 싶으면 Integer (reference타입으로 사용)
	
	// 필드
	private T obj;			// 메인에서 선언하지 않은 T는 아직 정해지지 않은 대기중인 데이터 타입이다. 
							// 29번줄에서 선언한 순간 T는 Ball타입의 데이터 타입으로 변환된다.

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
		// Bag<Ball> bag = new Bag<>();
		Bag<Ball> bag = new Bag<Ball>();
		
		bag.setObj(new Ball());			// new Pen을 넣으면 오류가 난다. 위에서 이미 타입을 지정했기 때문에 -> 이것이 제네릭
		Ball ball = bag.getObj();		// 제네릭을 사용하면 다운캐스팅이 필요없다.
		System.out.println(ball);
		
	}
}
