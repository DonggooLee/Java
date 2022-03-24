package org.ddongq.test2;

public class SalaryWorker extends Employee {
	
	// 필드
	int salary;
	
	// 생성자
	public SalaryWorker() {}

	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}

	// 메소드
	@Override
	int pay() {
		return salary;
	}

	@Override
	void output() {
		super.output();
		System.out.println("월   급 : "+pay());
	}
	
}
