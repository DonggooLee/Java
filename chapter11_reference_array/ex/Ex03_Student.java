package org.ddongq.ex;

public class Ex03_Student {
	/*
	 * 필드
	 * - 이름 name
	 * - 학과 dept
	 * - 점수 score1 ,score1 (String)
	 * - 평균 average
	 * - 합격 여부 isPass
	 * 
	 * 메소드
	 * - 생성자
	 * - getAverage(평균리턴) 
	 * - getPass(합격여부리턴)
	 * - output
	 */
	
	String name, dept, score1, score2;
	double average;
	boolean isPass;
	
	// 생성자
	public Ex03_Student() {
	}

	public Ex03_Student(String name, String dept, String score1, String score2) {
		this.name = name;
		this.dept = dept;
		this.score1 = score1;
		this.score2 = score2;
		this.average = getAverage();
		this.isPass = getPass();
	}
	
	// 메소드
	double getAverage() {
		double a = Double.parseDouble(score1);
		double b = Double.parseDouble(score2);
		return (a+b) / 2;
	}
	
	boolean getPass() {
		return getAverage() >= 80 ? true : false;
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
//		System.out.println("중간점수 : " + score1);
//		System.out.println("기말점수 : " + score2);
		System.out.println("평균 : " + average);
		System.out.println("합불? : " + (isPass ? "합격" : "불합격"));
	}
	
}
