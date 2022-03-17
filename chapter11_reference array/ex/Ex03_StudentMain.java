package org.ddongq.ex;

public class Ex03_StudentMain {
	public static void main(String[] args) {
		
		Ex03_StudentManager manager = new Ex03_StudentManager(2);
		
		manager.addNewStudent(manager.input());
		manager.addNewStudent(manager.input());
		manager.outputAllStudents();
		
		System.out.println("--------------");
		manager.outputAverage();
		
		System.out.println("--------------");
		manager.findStudent();
		
	}
}
