package org.ddongq.ex;

class MyThread extends Thread {
	
	/*
	 * 1. 스레드 클래스를 상속 받아 정의
	 *  - run() 메소드를 재정의(override)해서 스레드가 실행할 코드를 작성
	 */
	
	private String str;
	
	public MyThread(String str) {
		this.str = str;
	}
	
	@Override
	public void run() {
		// 전달 받은 문자열 str 을 10번 출력하는 반복문 작성
		// 0~1초 까지의 시간 텀(sleep 이용)을 두고 실행
		
		for(int i=0; i<10; i++) {
			System.out.println(str);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Other Thread End !!");
	}
	
}

public class Ex02_multiThread {
	public static void main(String[] args) {

		/*
		 * run()을 호출하면 단순히 클래스에 속한 메소드를 호출하는 것 뿐
		 * start()는 스레드 작업을 실행하는데 필요한 호출 스택을 생성한 다음 run()을 호출
		 */
		
		System.out.println("Main Thread Start");
		
		MyThread mt1 = new MyThread("*");
		MyThread mt2 = new MyThread("-");
		
		mt1.start();
		mt2.start();
		
		System.out.println("Main Thread End");
		
	}
}
