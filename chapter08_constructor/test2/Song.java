package org.ddongq.test2;

public class Song {
	
	// 필드
	String title;
	String country;
	
	// 생성자
	public Song() {}
	public Song(String title, String country) {
		this.title = title;
		this.country = country;
	}
	
	// 메소드
	void output() {
		System.out.println("제목 : " + title);
		System.out.println("국가 : " + country);
	}
	
}
