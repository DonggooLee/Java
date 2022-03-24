package org.ddongq.test;

public class Customer {
//	필드 : int money, int startMoney, Product[] cart, int numOfProduct
//	메소드 : Constructor, buy(Product), output
	
	// 필드
	private int money, startMoney, numOfProduct;
	Product[] cart = new Product[10];
	
	// 생성자
	public Customer() {}
	public Customer(int money) {
		this.money = money;
		this.startMoney = money;
	}
	
	// 메소드
	public void buy(Product product) {
		// Product 부모 클래스를 사용하기 위해 product 객체 생성 & 업캐스팅으로 받는다
		if(money<product.getPrice()){
			System.out.println("소지한 금액이 부족합니다");
			//return;	// 해당 함수를 빠져나가는 명령
		}else {
			// 구매한 만큼 금액 차감
			money -= product.getPrice();
			// 카트에 상품 추가
			cart[numOfProduct] = product;
			numOfProduct++;
		}
	}
	
	public void output() {
		// 구매 상품, 금액(처음 소지금액, 총 구매금액, 남은 금액)
		for(int i=0; i<numOfProduct; i++) {
			System.out.println("구매상품 : "+cart[i].getModel()+", "+cart[i].getPrice());
		}
		System.out.println("처음 소지 금액 : " + startMoney);
		System.out.println("총 구매 금액 : " + (startMoney-money));
		System.out.println("남은 금액 : " + money);
	}
	
}
