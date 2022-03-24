package org.ddongq.test;

public class SalaryWorker extends Employee {
//	필드 : int salary
//	메소드 : Constructor, int pay(), void output()
	
	// 필드
	private int salary;
	
	// 생성자
	public SalaryWorker() {
	}

	public SalaryWorker(String name, String dept, int salary) {
		super(name, dept);
		this.salary = salary;
	}

	// 메소드
	@Override
	public int pay() {
		return salary;
	}

	@Override
	public void output() {
		super.output();
		System.out.println("급 여 : " + salary + " 원");
	}
	
}
