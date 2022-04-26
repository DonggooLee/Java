package org.ddongq.test;

/*
	Q3. Test03.java
	1. 메인클래스를 보고 알맞은 클래스들을 구현하시오.
	2. Product 클래스를 구현하시오.
		필드 : T1 category, T2 model
		적절한 메소드 구현하기
		
		public static void main(String[] args) {
	
		Product<Elec, Tv> product1 = new Product<>();
		Product<Life, Cup> product2 = new Product<>();
	
		product1.setCategory(new Elec());
		product1.setModel(new Tv("LG"));
		
		System.out.println(product1);			// 출력 예시) 전자제품, LG TV
*/

class Product<T1, T2> {
	
	// 필드
	private T1 category;
	private T2 model;
	
	public void setCategory(T1 category) {
		this.category = category;
	}
	
	public void setModel(T2 model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "카테고리 : " + category + ", 모델 : " + model;
	}
	
}

class Elec {
	@Override
	public String toString() {
		return "전자제품";
	}
}

class Life {
	@Override
	public String toString() {
		return "생활용품";
	}
}

class Tv {
	private String name;
	public Tv(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name+" TV";
	}
}

class Cup {
	private String name;
	public Cup(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name+" 컵";
	}
}


public class Test03 {
	public static void main(String[] args) {
		
		Product<Elec, Tv> product1 = new Product<>();
		Product<Life, Cup> product2 = new Product<>();

		product1.setCategory(new Elec());		// 단순히 메소드를 호출하면 toString 이 나오게 된다
		product1.setModel(new Tv("LG"));
		
		System.out.println(product1);			// 출력 예시) 전자제품, LG TV

		product2.setCategory(new Life());
		product2.setModel(new Cup("스타벅스"));
		
		System.out.println(product2);
		
	}
}
