package org.ddongq.test;

public class SingerSongMain {
	public static void main(String[] args) {
		
		Singer singer = new Singer("아이유", 3);
		Song s1 = new Song("좋은날", "대한민국");
		
		singer.setSong(s1);
		singer.setSong(new Song("마쉬멜로우", "대한민국"));
		singer.setSong(new Song("내손을잡아", "대한민국"));
		singer.output();
	}
}