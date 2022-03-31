package org.ddongq.ex;

public class Ex01_mainTread {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			// 예외처리 필수
			try {
				Thread.sleep(1000);	// 1 초간 일시정지 -> 밀리초 단위
				System.out.println("Main Thread " + i + " 번째 출력");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
