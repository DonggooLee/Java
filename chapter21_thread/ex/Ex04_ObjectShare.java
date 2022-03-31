package org.ddongq.ex;

class MusicBox {
	
	// 메소드 rock(), ballad(), dance()
	// 각각 노래 5번 출력하는 메소드
	
	public void rock() {
		for(int i=0; i<5; i++) {
			System.out.println("Play the rock");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void ballad() {
		for(int i=0; i<5; i++) {
			System.out.println("Play the ballad");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void dance() {
		for(int i=0; i<5; i++) {
			System.out.println("Play the dance");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class MusicPlayer extends Thread {
	
	private int type;
	private MusicBox musicbox;

	public MusicPlayer(int type, MusicBox musicbox) {
		this.type = type;
		this.musicbox = musicbox;
	}
	
	@Override
	public void run() {
		// type이 1이면 rock(), 2이면 ballad(), 3이면 dance()
		// switch 이용
		switch (type) {
		case 1 : musicbox.rock();	break;
		case 2 : musicbox.ballad(); break;
		case 3 : musicbox.dance();  break;
		}
	}
	
}

public class Ex04_ObjectShare {
	public static void main(String[] args) {
		
		MusicBox box = new MusicBox();
		
		MusicPlayer music1 = new MusicPlayer(1, box);
		MusicPlayer music2 = new MusicPlayer(2, box);
		MusicPlayer music3 = new MusicPlayer(3, new MusicBox());
		
		music1.start();
		music2.start();
		music3.start();
		
	}
}
