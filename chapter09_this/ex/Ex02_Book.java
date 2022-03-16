package org.ddongq.ex;

public class Ex02_Book {
	
	// 필드
	String title, writer;
	int price, salesVolume;
	boolean isBsetSeller;
	
	// 생성자 (초기화 위해 사용)
	public Ex02_Book() {

	}
	
	public Ex02_Book(String title, int price) {
		this(title, price, "작자미상");	// refactoring : 괄호에 들어가는 것과 일치하는 생성자를 불러오는 의미
//		this.title = title;
//		this.price = price;
//		this.writer = "작자미상";
	}
	
	public Ex02_Book(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	
	// 메소드
	void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
			if (salesVolume >= 1000) {
				isBsetSeller = true;
			} else {
				isBsetSeller = false;
			}
	}
	
	void info() {
		System.out.println("책 제목 : " + title);
		System.out.println("책 가격 : " + price);
		System.out.println("책 저자 : " + writer);
		System.out.println("책 판매량 : " + salesVolume);
		System.out.println("베스트셀러 유무 : " + (isBsetSeller ? "베스트셀러" : "일반서적"));
	}
	
}
