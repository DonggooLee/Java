package org.ddongq.test;

public class Grade {
	/*
	Q3.
	Grade.java			필드 - int kor, int eng, int mat, double average, char grade
						메소드 - Constructor, getAverage(평균을 리턴), getGrade(학점을 리턴)
	Student.java		필드 - String name, String dept, Grade grade
						메소드 - Constructor, output
	StudentGradeMain.java
	*/
	
	// 필드
	int	kor, eng, mat;
	double average;
	char grade;
	
	// 생성자
	public Grade() {

	}
	
	public Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		average = getAverage();		// 리턴하면서 average 라는 필드명 입력안했기 때문에 적음
		getGrade(); 				// 리턴하면서 grade 라는 필드명 입력했기 때문에 적지 않음
	}
	
	// 메소드
	double getAverage() {
		return (kor+eng+mat)/3.0;	// 리턴하면서 average 라는 필드명 입력 안함
	}
	
	char getGrade() {				// 리턴하면서 grade 라는 필드명 입력
		return grade = 
			average >= 90 ? 'A' : 
				average >= 80 ? 'B' : 
					average >= 70 ? 'C' : 
						average >= 60 ? 'D' : 'F';
	}
			
		// 방식 1
//		if(average >= 90) {
//			return 'A';
//		}else if(average >= 80) {
//			return 'B';
//		}else if(average >= 70) {
//			return 'C';
//		}else if(average >= 60) {
//			return 'D';
//		}else {
//			return 'F';
//		}
						
		// 방식 2
//		char tmp;
//		if(average >= 90) {
//			tmp = 'A';
//		}else if(average >= 80) {
//			tmp = 'B';
//		}else if(average >= 70) {
//			tmp = 'C';
//		}else if(average >= 60) {
//			tmp = 'D';
//		}else {
//			tmp = 'F';
//		}
//		return tmp;
//	}
	
}
