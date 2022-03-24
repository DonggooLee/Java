package org.ddongq.test;

public class Test01 {
	public static void main(String[] args) {
		
		Employee[] employees = new Employee[3];
		employees[0] = new SalaryWorker("철수", "기재부", 1800000);
		employees[1] = new SalesWorker("짱구", "총무과", 2000000);
		employees[2] = new PartTimeWorker("맹구", "인사과", 8, 12000);

		if(employees[1] instanceof SalesWorker) {
			((SalesWorker)employees[1]).setSalesVolume(1800);
		}
		
		employees[0].output();
		System.out.println("---------------");
		employees[1].output();
		System.out.println("---------------");
		employees[2].output();
		
	}
}
