package org.ddongq.test;

public class Test02 {
	public static void main(String[] args) {
		
		Customer customer = new Customer(1000);
		
//		Product tv = new Tv("LG 올레드 티비", 500);
//		Product computer = new Computer("Apple 맥북", 300);

		// 업캐스팅
		customer.buy(new Tv("LG 올레드 티비", 500));	// buy(매개변수에 new~를 넣어서 업캐스팅을 해준다.)
//		customer.buy(tv);
		customer.buy(new Computer("Apple 맥북", 200));
//		customer.buy(computer);
		
		customer.output();
		
	}
}
