package org.ddongq.ex;

public class Ex02_BookMain {
	public static void main(String[] args) {
		Ex02_Book test1 = new Ex02_Book("이것이 자바다", 28000);
		Ex02_Book test2 = new Ex02_Book("자바의 정석", 28000, "남궁성");
		
		test1.setSalesVolume(5000);
		test2.setSalesVolume(810);
		
		test1.info();
		test2.info();
	}
}
