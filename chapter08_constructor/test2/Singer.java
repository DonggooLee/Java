package org.ddongq.test2;

public class Singer {
	
	// 필드
	String name;
	Song song;
	
	// 생성자
	public Singer() {}
	
	public Singer(String name) {
		this.name = name;
	}
	
	// 메소드
	void setSong(Song song) {
		this.song = song;
	}
	
	void output() {
		System.out.println("가수 : " + name);
		song.output();
	}
	
}
