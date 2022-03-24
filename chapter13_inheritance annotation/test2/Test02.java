package org.ddongq.test2;

public class Test02 {
	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("맥북프로", 1800000, "20시간");
		notebook.output();
		
		System.out.println("------------------");
		
		Tablet tablet = new Tablet("아이패드", 990000, "13시간", "애플펜슬2");
		tablet.output();
		
	}
}
