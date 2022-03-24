package org.ddongq.test;

public class PartTimeWorker extends Employee {
//	필드 : int workTime, int payPerHour
//	메소드 : Constructor, int pay(), void output()
	
	// 필드
	private int workTime, payPerHour;
	
	// 생성자
	public PartTimeWorker() {}

	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}

	@Override
	public int pay() {
		return workTime * payPerHour;
	}

	@Override
	public void output() {
		super.output();
		System.out.println("일한시간 : " + workTime+" 시간");
		System.out.println("시 급 : " + payPerHour+" 원");
		System.out.println("총 액 : " + pay() +" 원");
	}

}
