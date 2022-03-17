package org.ddongq.test;

public class Song {
	/*
	Q2. 
	Song.java			- 필드 : String title, String country
						- 메소드 : Constructor, output
	Singer.java			- 필드 : String name, 
							 	Song[] songList(Song의 객체 n개를 메인으로부터 받아서 처리),
				 			 	int idx(배열 인덱스에 접근용도)						
						- 메소드 : Constructor, setSong(song), output, songList = 
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
		System.out.println("제목 : " + title);
		System.out.println("국가 : " + country);
	}
	
}
