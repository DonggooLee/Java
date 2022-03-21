package org.ddongq.ex;

public class Ex06_LocalMain {
	public static void main(String[] args) {
		
		Ex06_Local person1 = new Ex06_Local("김김김", 30, "999999-1234567");
		Ex06_Local person2 = new Ex06_Local("박박박", 25, "888888-5678912");
		Ex06_Local person3 = new Ex06_Local("돼지왕", 20);
		
		person1.output();
		System.out.println("---------------------------");
		person2.output();
		System.out.println("---------------------------");
		person3.output();
		
	}
}
