package org.ddongq.ex;

public class Ex02_ManMain {
	public static void main(String[] args) {
		// main 메소드에 static이 필요한 이유
		// main 메소드를 포함하는 클래스의 객체(인스턴스) 생성 없이도 main을 호출 하기 위해서
		// 예) new Ex02_ManMain() 없이 main 메소드의 호출을 위해 static이 반드시 필요하다.
		
		Ex02_Man man = new Ex02_Man("홍길동", 49);
		man.output();
		
		System.out.println("----------");
		
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.GENDER);				// 객체(인스턴스).~ ( X ) 접근	
		System.out.println(Ex02_Man.GENDER); 		// 클래스.~ ( O ) 접근 => // GENDER 필드는 static 필드이기 떄문에 new 와 상관없이 접근 가능하다.
		
	}
}
