package org.ddongq.ex;

public class Ex01_Book {
	// 변수(필드)
	String title;
	String writer;
	int price;
	boolean isBestSeller;
	
	// 메소드
	void info() {	// 메소드 이름 : info
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println(isBestSeller ? "베스트셀러" : "일반서적");
	}
	
}
