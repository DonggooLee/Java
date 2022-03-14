package org.ddongq.ex;

public class Ex03_RecursiveClass {
	
	static int count = 0; //static은 메인 클래스에서만 사용한다
	
	// 재귀 메소드 (재귀 호출로 반복문 형식 사용)
	static void recursive() {
		System.out.println("recursive() call");
		count++;
		if(count == 5) {
			return;		// recursive 메소드 종료
		}
		
		recursive();
	}
	
	public static void main(String[] args) {
		
		recursive();
		
		for(int i=0; i<5; i++) {
			System.out.println("recursive() call_2");
		}
		
	}
		
}
