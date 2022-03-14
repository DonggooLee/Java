package org.ddongq.ex;

public class Ex01_RectMain {
	public static void main(String[] args) {
		
		// 1. 객체(인스턴스) 생성
		Ex01_Rect nemo1 = new Ex01_Rect();

		// 2. 메소드 호출
		nemo1.setFields(3, 4);
		nemo1.output();
		
		// ---------
		// 객체 nemo2 만들어서 출력
		Ex01_Rect nemo2 = new Ex01_Rect();
		nemo2.setFields(4);
		nemo2.output();
		
	}
}
