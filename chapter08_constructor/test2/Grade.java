package org.ddongq.test2;

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
	int kor, eng, mat; 
	double average; 
	char grade;
	
	// 생성자
	public Grade() {}

	public Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		average = getAverage();
		grade = getGrade();
	}
	
	// 메소드
	double getAverage() {
		return (double)(kor+eng+mat)/3.0;
	}
	
	char getGrade() {
		return average >= 90 ? 'A' : 
					average >= 80 ? 'B' : 
						average >= 70 ? 'C' : 
							average >= 60 ? 'D' : 'F';
	}
	
}
