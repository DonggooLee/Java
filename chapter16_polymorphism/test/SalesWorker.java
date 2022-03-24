package org.ddongq.test;

public class SalesWorker extends SalaryWorker {
//		필드 : int salesVolume, 
//		double salesIncentive --> 인센티브 비율(1000이상 10%, 500이상 5% 나머지 1%)
//		메소드 : Constructor, int pay(), void output(), int salesPay()
//		void setSalesVolume(salesVolume), 
//		void setSalesIncentive(salesIncentive)
	
	// 필드
	private int salesVolume;
	private double salesIncentive;
	
	// 생성자
	public SalesWorker() {}
	public SalesWorker(String name, String dept, int salary) {
		super(name, dept, salary);
	}
	
	// 메소드
	private int salesPay() {
		return (int)(super.pay() * salesIncentive);
	}
	
	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		if(salesVolume>=1000) {
			setSalesIncentive(0.1);
		}else if(salesVolume>=500) {
			setSalesIncentive(0.05);
		}else{
			setSalesIncentive(0.01);
		}
	}
	
	public void setSalesIncentive(double salesIncentive) {
		this.salesIncentive = salesIncentive;
	}
	
	@Override
	public int pay() {
		return super.pay() + salesPay();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("수 당 : " + salesPay() + " 원");
		System.out.println("판매 인센티브 : " + salesIncentive + " %");
		System.out.println("판 매 량 : " + salesVolume + " 부");
		System.out.println("총 급 여 : " + pay() + "원");
	}
	
}
