package org.ddongq.test;

public class Song {
	/*
	Q2.
	Song.java				필드 - String title, String country
							메소드 - Constructor, output
	Singer.java				필드 - String name, Song song 
							메소드 - COnstructor, setSong(s), output
	SingerSongMain.java	
	 */
	
	// 필드
	String title, country;
	
	// 생성자
	public Song() {

	}
	
	public Song(String title, String country) {
		this.title = title;
		this.country = country;
	}
	
	// 메소드
	void output() {
		System.out.println("노래 제목 : " + title);
		System.out.println("국가 : " + country);
	}
	
}
