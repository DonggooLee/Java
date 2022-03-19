package org.ddongq.run;

import org.ddongq.control.StudentManager;

public class StudentMain {
	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager(2);
		
		manager.addNewStudent(manager.input());
		manager.addNewStudent(manager.input());
		manager.outputAllStudents();
		
		System.out.println("--------------");
		manager.outputAverage();
		
		System.out.println("--------------");
		manager.findStudent();
		
	}
}
