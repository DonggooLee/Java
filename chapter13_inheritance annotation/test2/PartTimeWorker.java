package org.ddongq.test2;

public class PartTimeWorker extends Employee {
	
	// 필드
	int workTime, payPerHour;
	
	// 생성자
	public PartTimeWorker() {}

	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	
	// 메소드
	@Override
	int pay() {
		return workTime * payPerHour;
	}

	@Override
	void output() {
		super.output();
		System.out.println("일한시간 : " + workTime+" 시간");
		System.out.println("시   급 : " + payPerHour+" 원");
		System.out.println("총   액 : " + pay() +" 원");
	}
	
}
