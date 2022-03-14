package org.ddongq.ex;
// 클래스가 한 파일에 2개 이상인 경우
// public 키워드는 파일명과 일치하는 클래스에만 명시한다.
// 객체를 만들어서 쓰면 좋은 이유는 변수명을 바꾸지 않기 때문에 더욱 편리하다.

class Person{
	// 필드(변수)
	char gender;
	int age;
	double height;
	String name;
	
	// 메소드
	void info() {
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("이름 : " + name);
	}
}

public class Ex03_PersonMain {
	public static void main(String[] args) {
		Person woman = new Person();
		Person man = new Person();
		woman.gender = '여';		// char 방식이라 '' 따옴표 사용
		woman.age = 80;
		woman.height = 150.3;
		woman.name = "김옥분";
		woman.info();

		System.out.println("-------------------");
		
		man.gender = '남';
		man.age = 40;
		man.height = 178.3;
		man.name = "김개똥";
		man.info();
	}
}
