package org.ddongq.test2;

public class Worker extends Human {
	
	// 필드
	String job;
	
	// 생성자
	public Worker() {}

	public Worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}

	// 메소드
	@Override
	void output() {
		super.output();
		System.out.println("직장 : " + job);
	}
	
}
