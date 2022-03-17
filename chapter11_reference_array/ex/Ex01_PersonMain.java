package org.ddongq.ex;

public class Ex01_PersonMain {
	public static void main(String[] args) {
		
		// 크기 3의 참조 배열 people 을 선언 후 값 입력
		// 배열 선언 
		// 배열에 입력 (인데스 하나에 클래스가 하나 통으로 들어간다.)
		
		Ex01_Person[] people = new Ex01_Person[3];
		// people : 참조변수
		
		/*
		// 입력 1
		people[0] = new Ex01_Person("김씨", 52, 162.3, '남');
		
		// 입력 2
		people[1] = new Ex01_Person();
		people[1].age = 18;
		people[1].gender = '여';
		people[1].name = "양씨";
		people[1].height= 162.1;
		
		// 출력
		people[0].output();
		people[1].output();
		*/
		
		// 필드 초기화는 안되지만 객체생성은 가능
		for(int i=0; i<people.length; i++) {
			people[i] = new Ex01_Person(); // 객체 생성 만 초기화 X
		}
		
		// 입력 
		people[0].name = "이씨";
		people[0].age= 15;
		people[0].height= 153.6;
		people[0].gender= '남';
		
		// 출력
		people[0].output();
		
	}
}
