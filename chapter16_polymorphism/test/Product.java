package org.ddongq.test;

public class Product {
//	필드 : String model, int price
//	메소드 : Constructor, getters
	
	// 필드
	private String model;
	private int price;
	
	// 생성자
	public Product() {}

	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}

	// 메소드
	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}

}
