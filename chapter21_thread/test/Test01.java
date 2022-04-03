package org.ddongq.test;

public class Test01 extends Thread {

	@Override
	public void run() {
		long s_time;
		long e_time;
		
		try {
			s_time = System.currentTimeMillis();
			// 1초간 일시정지
			Thread.sleep((int)(Math.random()*1000));	// 필수로 예외처리를 해줘야 한다.
			e_time = System.currentTimeMillis();
			System.out.println("멀티 스레드 걸린 시간 : " + (e_time-s_time));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Test01 thread = new Test01();
		thread.start();			
		
		long s_time;
		long e_time;
		
		try {
			s_time = System.currentTimeMillis();
			// 1초간 일시정지
			Thread.sleep((int)(Math.random()*1000));		// 필수로 예외처리를 해줘야 한다.
			e_time = System.currentTimeMillis();
			System.out.println("메인 스레드 걸린 시간 : " + (e_time-s_time));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
