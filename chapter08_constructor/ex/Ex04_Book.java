package org.ddongq.ex;

public class Ex04_Book {
	/*
	 * 필드
	 * - 책 제목 title
	 * - 저자 writer
	 * - 가격 price
	 * - 판매량 salesVolume
	 * - 베스트 셀러 판단 isBestSeller
	 * 
	 * 메소드
	 * - 1) 기본생성자
	 * - 2) 책제목, 가격 초기화 하는 생성자			-> 저자는 "작자미상"으로 출력
	 * - 3) 책 제목, 가격, 저자 초기화 하는 생성자
	 * - 판매량 입력 받는 setSalesVolume(int sales) 메소드-> 판매량이 1000이상이면 베스트 셀러
	 * - 제목, 저자, 가격, 판매량, 베스트셀러 or 일반서적 출력하는 output
	 */
	
	String title, writer;
	int price, salesVolume;
	boolean isBestSeller;
	
	public Ex04_Book() {
		
	}
	
	public Ex04_Book(String title, int price) {
		this.title = title;
		this.price = price;
		writer = "작자미상";
	}
	
	public Ex04_Book(String title, int price, String writer) {
		this.title = title;
		this.price = price;
		this.writer = writer;
	}
	
	void setSalesVolume(int sales) {
		this.salesVolume = sales;
		if(salesVolume>=1000) {
			isBestSeller = true;
		}else {
			isBestSeller = false;
		}
	}
	
	
	void output() {
		System.out.println("제 목 : " + title);
		System.out.println("저 자 : " + writer);
		System.out.println("가 격 : " + price);
		System.out.println("판매량 : " + salesVolume);
		System.out.println("베스트? : " + (isBestSeller ? "베스트셀러" : "일반서적"));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
