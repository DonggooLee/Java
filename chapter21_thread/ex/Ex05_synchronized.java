package org.ddongq.ex;

class AnimalSound {
	
	/*
	 * 1. synchronized(동기화)
	 * 		1) 메소드에 붙여 사용
	 * 			(1) 여러개의 Thread들이 공유 객체의 메소드를 사용할때
	 * 				메소드에 synchronized가 붙어 있을 경우, 먼저 호출한 메소드가
	 * 				객체의 사용권(Monitoring Lock)을 얻는다.
	 * 				모니터링 락은 메소드가 종료되거나, wait() 같은 메소드를 만나기 전까지 유지된다.
	 * 			(2) 메소드가 길어지게 될 경우 대기 시간이 증가할 수 있다. 
	 * 		2) synchronized 블럭 사용
	 */
	
	public synchronized void dog() {
		for(int i=0; i<5; i++) {
			System.out.println("멍-멍");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void cat() {
		for(int i=0; i<5; i++) {
			System.out.println("야~옹");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void bird() {
		synchronized(this) {
			for(int i=0; i<5; i++) {
				System.out.println("짹! 짹!");
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}

class Animal extends Thread {
	
	private int type;
	private AnimalSound sound;
	
	public Animal(int type, AnimalSound sound) {
		this.type = type;
		this.sound = sound;
	}

	@Override
	public void run() {
		switch (type) {
		case 1 : sound.dog();	break;
		case 2 : sound.cat();	break;
		case 3 : sound.bird();	break;
		}
	}
	
}

public class Ex05_synchronized {
	public static void main(String[] args) {
		
		AnimalSound sound = new AnimalSound();
		
		Animal animal1 = new Animal(1, sound);
		Animal animal2 = new Animal(2, sound);
		Animal animal3 = new Animal(3, sound);
		
		animal1.start();
		animal2.start();
		animal3.start();
		
	}
}
