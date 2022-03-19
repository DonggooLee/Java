package org.ddongq.control;

import java.util.Scanner;

import org.ddongq.data.Student;

public class StudentManager {
	
	Student[] arr;
	Scanner sc = new Scanner(System.in);
	int idx;
	
	// 생성자
	public StudentManager() {
		
	}
	
	// 관리할 학생 수 초기화 생성자
	public StudentManager(int numoOfStudents) {
		arr = new Student[numoOfStudents];
	}
	
	// 배열에 학생 객체 대입 메소드 addNewStudent()
	public void addNewStudent(Student student) {
		arr[idx++] = student;
	}
		
	// 학생 정보 입력 메소드 input()
	public Student input() {
		System.out.println("학생 이름 입력 : ");
		String name = sc.next();
		System.out.println("학생 학과 입력 : ");
		String dept = sc.next();
		System.out.println("중간 점수 입력 : ");
		String score1 = sc.next();
		System.out.println("기말 점수 입력 : ");
		String score2 = sc.next();
		return new Student(name, dept, score1, score2);
	}
	
	// 학생 전체 정보 출력 메소드 outputAllStudents()
	public void outputAllStudents() {
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1) + "번째 학생 정보 출력 -----");
			arr[i].output();
		}
	}
	
	// 학생 전체의 평균 값 출력 메소드 outputAverage()
	public void outputAverage() {
		double total=0;
		for(int i=0;i<idx;i++) {
			total += arr[i].getAverage();
		}
		System.out.println("전체 평균 : "+(total/idx)); //배열의 길이에 상관없이 idx 사용하면 학생 수 만큼만 돈다
	}
	
	// 특정 이름으로 학생 찾기 findStudent()
	public void findStudent() {
		System.out.println("찾을 학생의 이름 입력 : ");
		String fName = sc.next();
		for(int i=0;i<idx;i++) {
			if(fName.equals(arr[i].name)) {
				arr[i].output();
			}
		}
	}
	

}
