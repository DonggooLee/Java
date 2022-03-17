package org.ddongq.ex;

public class Ex02_LocalMain {
	public static void main(String[] args) {

//		클래스명 객체명 = new 클래스명();
//		클래스명 인스턴스명 = new 클래스명();
		
		Ex02_Local person1 = new Ex02_Local();
		Ex02_Local person2 = new Ex02_Local();
		
		person1.setLocalInfo("김씨", 50);
		person2.setLocalInfo("카말", 45, "777777-2897777");
		
		person1.output();
		System.out.println("------------------");
		person2.output();
		
	}
}
