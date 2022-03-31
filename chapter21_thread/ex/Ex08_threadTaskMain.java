package org.ddongq.ex;

/*
 * 1. 스레드 우선순위
 *  - 스레드의 실행 순서를 조절할 때 사용
 *  - thread.setPriority(우선순위);
 *  	1) 매개값으로 1~10의 값을 줘도 된다.
 *  	2) 상수 사용
 *  		(1) Thread.MAX_PRIORITY		10의 값
 *  		(2) Thread.NORM_PRIORITY	5의 값
 *  		(3) Thread.MIN_PRIORITY		1의 값
 */

public class Ex08_threadTaskMain {
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			
			Runnable run = new Ex08_threadTask("thread"+i);	// 스레드 이름
			Thread thread = new Thread(run);
			
			if(i == 9)
				thread.setPriority(Thread.MAX_PRIORITY);
			else
				thread.setPriority(Thread.MIN_PRIORITY);
			
			thread.start();
			
		}
		
	}
}
