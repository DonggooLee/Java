package org.ddongq.ex;

class Person{
	public void eat(String food) {
		System.out.println(food + "먹는다");
	}
	public void sleep() {
		System.out.println("잔다");
	}
}

class Student extends Person{
	public void study() {
		System.out.println("공부한다");
	}
}

class Worker extends Person{
	public void work() {
		System.out.println("일한다");
	}
}

public class Ex04_polymorphism {
	public static void main(String[] args) {
		
		Person person1 = new Student();		// 업캐스팅
		person1.eat("급식");
		person1.sleep();
		// 객체 생성 및 형변환
		if(person1 instanceof Student) {	// 다운캐스팅
			Student perStudent = (Student)person1;
			perStudent.study();
		}
		// 객체 생성 X 형변환
		((Student)person1).study();
		
		Person person2 = new Worker();	// 업캐스팅
		person2.eat("돈까스");
		person2.sleep();
		// 객체 생성 및 형변환
		if(person2 instanceof Worker){	// 다운캐스팅
			Worker perWorker = (Worker)person2;
			perWorker.work();
		}
		// 객체 생성 X 형변환 후에
		((Worker)person2).work();
		
	}
}
