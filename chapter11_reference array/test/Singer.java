package org.ddongq.test;

public class Singer {

	// 필드
	String name; 
	Song[] songList;
	int idx;
	
	// 생성자
	public Singer() {
	
	}

	public Singer(String name, int songCount) {	// 메인에서 넣은 값이 배열의 크기(길이)를 정해줌
		this.name = name;
		songList = new Song[songCount]; 		
	}
	
	void setSong(Song song) { // Song 생성자를 만들기 위해
		songList[idx] = song; // idx = 0 부터 시작
		idx++;
	}
	
	void output() {
		System.out.println("가수 이름 : " + name);
		System.out.println("----- 대표 곡 모음 -----");
		for(int i=0; i<idx; i++) {
			songList[i].output();
		}
	}
}
