package org.ddongq.ex;

public class Ex04_BookMain {
	public static void main(String[] args) {
		
//		Ex04_Book book1 = new Ex04_Book();
		
		Ex04_Book book2 = new Ex04_Book("파이썬", 28000);
		book2.setSalesVolume(1800);
		book2.output();
		
		System.out.println("------------------------");
		
		Ex04_Book book3 = new Ex04_Book("자바", "김씨", 130000);
		book3.setSalesVolume(500);
		book3.output();
		
	}		
}
