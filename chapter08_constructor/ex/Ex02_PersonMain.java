package org.ddongq.ex;

public class Ex02_PersonMain {
	public static void main(String[] args) {
		Ex02_Person man = new Ex02_Person("철수", 80, 167.3,'남');
		man.output();
		
		//Ex02_Person woman = new Ex02_Person();
		/*
		 * 개발자가 생성자를 하나도!! 구현하지 않았다면 -> 자바가 디폴트 생성자를 만들어서 호출
		 * 개발자가 생성자를 하나라도!! 구현했다면 -> person(){} 형태의 생성자가 없을 때 오류 발생
		 * 즉! 개발자가 생성자를 만들면, 개발자가 원하는 모습으로만! 객체를 생성할 수 있다.
		 * 따라서 생성자 손댈때는 가급적 기본은 필수로 미리 만들기	
		 */
	}
}
