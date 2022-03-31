package org.ddongq.ex;

class MyThread3 implements Runnable {
	
	/*
	 * Thread.wait()
	 * Object.notify()
	 * 
	 * - 모니터링 락 설정 메소드
	 * - synchronized 블럭 내에서 사용해야 함
	 */
	
	public static int tot;

	@Override
	public void run() {
		synchronized(this) {
			for(int i=0; i<5; i++) {
			System.out.println((i+1) + "더하기");
			tot += (i+1);
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify(); // wait() 하고 있는 객체를 깨움
		}
	}
	
}

public class Ex06_synchronized {
	public static void main(String[] args) {
		
		Thread th = new Thread(new MyThread3());	// 스레드클래스에 있는 start 를 사용하기 위해서 thread 클래스 객체 생성
		th.start();
		
		// 만약 main 스레드가 아래의 블록이 위의 스레드보다 먼저 실행되었다면, wait하게 되면서
		// 모니터링 락을 놓고 대기
		synchronized (th) {
			// th.wait() 메소드를 호출
			// 메인스레드는 정지
			// MyThread3의 5번 값을 더한 후 notify를 호출하게 되면 wait에서 깨어님
			// Thread.sleep(500);
			System.out.println("다른 스레드가 완료될 때까지 기다립니다.");
			try {
				th.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("총합 : " + MyThread3.tot);
		}
		
	}
}
