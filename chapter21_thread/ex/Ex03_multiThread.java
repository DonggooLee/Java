package org.ddongq.ex;

class MyThread2 implements Runnable {
	
	/*
	 * 1. Ruunable 인터페이스를 구현하는 방법
	 * 	 - 인터페이스를 구현할 때에도 재정의할 때 어노테이션을 붙여준다.
	 * 	단일상속의 문제로 interface를 이용하는 경우가 많다.
	 */
	
	private String str;
	public MyThread2(String str) {
		this.str = str;
	}
	@Override
	public void run() {
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

public class Ex03_multiThread {
	public static void main(String[] args) {
		
		System.out.println("Main Thread Start");
		
		MyThread2 mt1 = new MyThread2("*");
		MyThread2 mt2 = new MyThread2("-");
		
		//start() 메소드를 사용하기 위해 Thread 클래스 객체를 사용한다. (상속받지 않았기 때문에)
		Thread t1 = new Thread(mt1);	
		Thread t2 = new Thread(mt2);
		
		t1.start();
		t2.start();
		
		System.out.println("Main Thread End");
		
	}
}
