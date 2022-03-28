package org.ddongq.ex;

/*
 * NullPointerException
 * 객체 참조가 없는 상태, 즉 null 값을 갖는 객체를 사용하는 경우 예외 발생
 */

public class Ex04_exception {
	public static void main(String[] args) {
		
		//String name = 김씨;
		try {
			String name = null;
			System.out.println(name.toString());
		} catch (NullPointerException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
			System.out.println("------------");
			System.out.println(e.getMessage());
		}
		
	}
}
