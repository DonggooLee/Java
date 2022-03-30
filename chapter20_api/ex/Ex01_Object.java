package org.ddongq.ex;

class Sample {

	@Override
	public String toString() {
		return "sample";
	}
	
}

public class Ex01_Object {
	public static void main(String[] args) {
		
		Object object = new Object();
		System.out.println(object);
		
		object = 10;					// 업캐스팅이라고 볼 수 있다
		System.out.println(object);
		
		object = "hello";
		System.out.println(object);
		
		object = new Sample();
//		System.out.println(object.toString());
		System.out.println(object);
		// 객체만 출력하더라도 자동으로 toString() 메소드가 반환된다.
		
	}
}
