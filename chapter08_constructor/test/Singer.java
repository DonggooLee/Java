package org.ddongq.test;

public class Singer {
	/*
	Q2.
	Song.java				필드 - String title, String country
							메소드 - Constructor, output
	Singer.java				필드 - String name, Song song 
							메소드 - COnstructor, setSong(s), output
	SingerSongMain.java	
	 */
	
//	String name;
//	Song song;		// Song 클래스에 song 이라는 인스턴스(객체)?
//	
//	public Singer() {
//		
//	}
//					// s(매개변수)에 받아서 전역변수(?) song에 넣어준다
//	public Singer(String name, Song song) {
//		this.name = name;
//		this.song = song;
//	}
//	
//	void output() {
//		System.out.println("가수 이름 : " + name);
//		song.output();
//	}
	
	// 필드
	String name;
	Song song;
		
	// 생성자
	Singer(String name){
		this.name = name;
	}
	
	// 메소드
	void setSong(Song song) {
		this.song = song;
	}
	
	void output(){
		System.out.println("가수명 : " + name);
		song.output();
	}
	
}
