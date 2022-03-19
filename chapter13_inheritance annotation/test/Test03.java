package org.ddongq.test;
/*
Q3. Test03.java 상속 관계로 구현하시오.
SalaryWorker.java			- 필드 : String name, String dept, int salary
							- 메소드 : Constructor, int pay(), output()	
SalesWorker.java			- 필드 : String name, String dept, int salary , double salesIncentive
							- 메소드 : Constructor, int pay(), output(), salesPay()	
PartTimeWorker.java			- 필드 : String name, String dept, int workTime, int payPerHour
							- 메소드 : Constructor, int pay(), output()	
String name : 이름
String dept : 부서
int salary : 기본급(월급)
double salesIncentive : 판매 인센티브
int workTime : 근무시간
int payPerHour : 시급
*/

class Employee {
	String name, dept;
	// 생성자
	public Employee() {
	}
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	// 메소드
	int pay() {
		return 0;	// ★★★ 여기서는 의미없기 때문에 초기화 하는 용도로만 사용
	}
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + dept);
	}
}

class SalaryWorker extends Employee {
	int salary;
	// 생성자
	public SalaryWorker() {
	}
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
		System.out.println("총급여 : " + pay());
	}
}

class SalesWorker extends SalaryWorker {
	double salesIncentive;
	// 생성자
	public SalesWorker() {
	}
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
		System.out.println("수당 : " + salesPay());
		System.out.println("총 급여 : " + pay());
	}
}

class PartTimeWorker extends Employee {
	int workTime;
	int payPerHour;
	// 생성자
	public PartTimeWorker() {
	}
	public PartTimeWorker(String name, String dept, int workTime, int payPerHour) {
		super(name, dept);
		this.workTime = workTime;
		this.payPerHour = payPerHour;
	}
	// 메소드
	@Override
	int pay() {
		return payPerHour*workTime;
	}
	@Override
	void output() {
		super.output();
		System.out.println("근무시간 : " + workTime + " 시간");
		System.out.println("시급 : " + payPerHour + " 원");
		System.out.println("총급여 : " + pay() + " 원");
	}
}

public class Test03 {
	public static void main(String[] args) {
		SalaryWorker worker_1 = new SalaryWorker("짱구", "총무과", 250);
		worker_1.output();
		
		System.out.println("---------------");
		
		SalesWorker worker_2 = new SalesWorker("철수", "인사과", 230, 0.1);
		worker_2.output();
		
		System.out.println("---------------");
		
		PartTimeWorker worker_3 = new PartTimeWorker("홍길동", "LG베스트샵", 200, 2);
		worker_3.output();
	}
}
