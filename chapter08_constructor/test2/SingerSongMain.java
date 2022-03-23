package org.ddongq.test2;

public class SingerSongMain {
	public static void main(String[] args) {
		
		// 객체 생성 없이 바로 집어넣기
		Singer singer_ = new Singer("아이유");
		singer_.setSong(new Song("내손을잡아", "대한민국"));
		singer_.output();
		
		System.out.println("--------------");
		
		// 객체 생성 후 집어넣기
		Singer singer_1 = new Singer("성시경");
		Song s = new Song("거리에서", "미국");
		singer_1.setSong(s);
		singer_1.output();
		
	}
}
