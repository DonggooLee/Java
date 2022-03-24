package org.ddongq.test2;

public class Test01 {
	public static void main(String[] args) {
		
		Student stu = new Student("철수", 18, "구트고등학교");
		stu.output();
		
		System.out.println("-----------------");
		
		Worker worker = new Worker("짱구", 26, "엔지니어");
		worker.output();
		
	}
}
