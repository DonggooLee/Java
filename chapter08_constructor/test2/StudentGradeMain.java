package org.ddongq.test2;

public class StudentGradeMain {
	public static void main(String[] args) {
		
		// 객체 생성 없이 바로 집어넣는 방법
		Student student1 = new Student("철수", "컴공", new Grade(80, 84, 88));
		student1.output();
		
		System.out.println("---------------");
		
		// 객체 생성 후 집어넣는 방법
		Grade g = new Grade(30, 22, 58);
		Student student2 = new Student("짱구", "유아교육", g);
		student2.output();
		
	}
}
