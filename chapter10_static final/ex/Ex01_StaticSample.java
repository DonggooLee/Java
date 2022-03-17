package org.ddongq.ex;

import javax.swing.JOptionPane;

public class Ex01_StaticSample {
	
	static final double PI = Math.PI;					// 누구나 사용할 수 있는 전역변수 Math <= 클래스
	
	public static void main(String[] args) {

		// 그동안 사용한 static 멤버들
		System.out.println(); 							// System <= 클래스, out <= 패키지 파일
		JOptionPane.showInputDialog("입력메세지");			// JOptionPane <= 클래스, showInputDialog <= 메소드
		JOptionPane.showMessageDialog(null, "Hello");	// JOptionPane <= 클래스, showMessageDialog <= 메소드
		
		// 공통점
		// new 가 없다. -> 객체 생성 안한다.
		
//		PI = 123;										// 위에 static final 로 고정했기 때문에 변경 불가능
//		System.out.println(PI);
		
	}
	
}
