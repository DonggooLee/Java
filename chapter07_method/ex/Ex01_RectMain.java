package org.ddongq.ex;

public class Ex01_RectMain {
	public static void main(String[] args) {
		
		// 1. 객체(인스턴스) 생성
		Ex01_Rect nemo1 = new Ex01_Rect();
		Ex01_Rect nemo2 = new Ex01_Rect();
		
		// 2. 메소드 호출
		nemo1.setFields(3, 4); // 메소드 오버로딩
		nemo2.setFields(5);
		
		nemo1.output();
		nemo2.output();
		
	}
}
