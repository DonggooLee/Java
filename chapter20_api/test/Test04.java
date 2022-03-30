package org.ddongq.test;

/*
필드 : String no(학번), String name, int[] scores(국,영,수)
double average, char grade, 상수 int COURSE_COUNT(과목수)
메소드 : Student(String no, String name)
	   setter{
		setScores(int kor, int eng, int mat) - 직접 입력
		setScores(int[] scores) - 랜덤 입력
		setAverage()
		setGrade()
		}
	   toString() 학번, 성명, 평균, 학점 출력
	   equals() 학번이 같으면 같은 학생으로 비교
*/

class Student {
	
	// 필드
	public static final int COURSE_COUNT = 3;	// 상수이기 때문에 static final 을 붙여줘야 한다.
	private String no, name;
	private int[] scores;
	private double average;
	private char grade;
	// 생성자
	public Student(String no, String name) {
		this.no = no;
		this.name = name;
		scores = new int[COURSE_COUNT];	// 생성자에서 초기화하는게 좋다!
	}
	// 메소드
	public void setScores(int kor, int eng, int mat) {
		scores[0] = kor;
		scores[1] = eng;
		scores[2] = mat;
		setAverage();
		setGrade();
	}
	public void setScores(int[] scores) {
		for(int i=0; i<scores.length; i++) {
			this.scores[i] = (int)(Math.random()*100);
		}
		setAverage();
		setGrade();
	}
	public void setAverage() {
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		average = sum / COURSE_COUNT;
//		average = (double)(scores[0] + scores[1] + scores[2]) / COURSE_COUNT;
	}
	public void setGrade() {
		grade = average>=90? 'A' :
						average>=80? 'B' :
							average>=70? 'C' :
								average>=60? 'D' : 'F';
	}
	@Override
	public String toString() {
		return "학번 : " + no + ", 성명 : " + name + ", 평균 : " + average + ", 학점 : " + grade;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Student) {
			Student stu = (Student)obj;
			return no.equals(stu.no);
		}
		return false;
	}
	
}

public class Test04 {
	public static void main(String[] args) {
		
		Student stu1 = new Student("133178", "홍길동");
		stu1.setScores(80, 70, 50);
		
		Student stu2 = new Student("133178", "김개똥");
		int[] arr = new int[Student.COURSE_COUNT];
		stu2.setScores(arr);
		
//		선생님 문제풀이
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*100);
//		}
		
		System.out.println("학생 1 : " + stu1.toString() );
		System.out.println("학생 2 : " + stu2.toString() );
		
		if(stu1.equals(stu2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
	}
}
