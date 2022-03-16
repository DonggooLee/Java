package org.ddongq.test;

public class SingerSongMain {
	public static void main(String[] args) {
		
//		Singer singer = new Singer("조수미", new Song("애국가", "대한민국"));
//		singer.output();
		
		Singer singer = new Singer("Bruno Mars");
		Song popSong = new Song("Treasure", "USA");
		singer.setSong(popSong);
		singer.output();
		
	}
}
