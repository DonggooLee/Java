package org.ddongq.ex;

public class Ex04_BookMain {
	public static void main(String[] args) {
		
		Ex04_Book book_1 = new Ex04_Book();
		book_1.setSalesVolume(500);
		book_1.output();
		
		System.out.println("-----------------");
		
		Ex04_Book book_2 = new Ex04_Book("자바의 정석", 12000);
		book_2.setSalesVolume(1153);
		book_2.output();
		
		System.out.println("-----------------");
		
		Ex04_Book book_3 = new Ex04_Book("파이썬", 13000, "이동구");
		book_3.setSalesVolume(300);
		book_3.output();
		
	}
}
