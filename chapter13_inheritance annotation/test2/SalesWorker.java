package org.ddongq.test2;

public class SalesWorker extends SalaryWorker {
	
	// 필드
	double salesIncentive;
	
	// 생성자
	public SalesWorker() {}

	public SalesWorker(String name, String dept, int salary, double salesIncentive) {
		super(name, dept, salary);
		this.salesIncentive = salesIncentive;
	}

	// 메소드
	int salesPay() {
		// 수당 = 기본급 * 인센티브
		return (int)(salary * salesIncentive);
	}
	
	@Override
	int pay() {
		return salary + salesPay();
	}

	@Override
	void output() {
		super.output();
		System.out.println("수   당 : " + salesPay());
		System.out.println("판매 인센티브 : " + salesIncentive);
	}
	
}
