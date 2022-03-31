package org.ddongq.ex;

/*
 * Thread.join()
 *  - 해당 스레드가 끝날 때까지 기다리게 하는 메소드
 */

class Join extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "더하기");
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(i+"번째 실행 (join1)");
		}
	}
}

class Join2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println((i+1) + "더하기");
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(i+"번째 실행 (join2)");
		}
	}
}

public class Ex07_join {
	public static void main(String[] args) {
		
		Join join = new Join();
		Join2 join2 = new Join2();
		
		System.out.println("메인 스레드 시작 !!!");
		
		try {
			join.start();
			join.join();
			join2.start();
			join2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료 !!!");
		
	}
}
