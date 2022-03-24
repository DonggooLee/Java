package org.ddongq.test2;

public class Test03 {
	public static void main(String[] args) {
		
		SalaryWorker man_1 = new SalaryWorker("철수", "총무과", 1800000);
		man_1.output();
		
		System.out.println("--------------------------");
		
		PartTimeWorker man_2 = new PartTimeWorker("짱구", "인사과", 8, 10000);
		man_2.output();
		
		System.out.println("--------------------------");
		
		SalesWorker man_3 = new SalesWorker("홍길동", "기재부", 1800000, 0.8);
		man_3.output();
				
		
	}
}
