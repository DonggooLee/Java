package org.ddongq.test;

public class StudentGradeMain {
	public static void main(String[] args) {
		
		Grade g = new Grade(80, 81, 25);
		Student info_student = new Student("홍길동", "컴공", g); // g 자리에 new Grade(100, 80, 80);를 넣어도 가능하다! (위에 g라는 객체 만든경우)
		info_student.output();
		
	}
}
