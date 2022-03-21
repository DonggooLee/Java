package org.ddongq.ex;

public class Ex04_Book {
	private String title;
	private String writer;
	private int price;
	private int salesVolume;		// 판매량
	private boolean isBestSeller;	// 판매량이 1000 이상이면 t, 아니면 f
	
	/*
	 * - 생성자
	 *   제목, 저자, 가격 입력
	 *   제목, 가격, > 저자는 "작자미상"
	 * - getter, setter
	 * - output()
	 */
	
	// 생성자
	public Ex04_Book() {}
	
	public Ex04_Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	public Ex04_Book(String title, int price) {
		this(title,"작자미상",price);
	}
	
	// 메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSalesVolume() {
		return salesVolume;
	}

	public void setSalesVolume(int salesVolume) {
		this.salesVolume = salesVolume;
		isBestSeller = (salesVolume >= 1000) ? true : false;
	}

	public boolean isBestSeller() {
		return isBestSeller;
	}

	public void setBestSeller(boolean isBestSeller) {
		this.isBestSeller = isBestSeller;
	}
	
	public void output() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price + " 원");
		System.out.println("베스트셀러? :" + (isBestSeller? "베스트셀러":"일반서적"));
	}
	
}