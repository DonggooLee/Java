package org.ddongq.ex;

public class Ex05_LocalMain {
	public static void main(String[] args) {
		
		Ex05_Local local_1 = new Ex05_Local();
		local_1.output();
		
		System.out.println("------------------");
		
		Ex05_Local local_2 = new Ex05_Local("김개똥",18);
		local_2.output();
		
		System.out.println("------------------");
		
		Ex05_Local local_3 = new Ex05_Local("홍길동",25,"941108-1332914");
		local_3.output();
		
	}
}
