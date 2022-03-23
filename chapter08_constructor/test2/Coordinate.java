package org.ddongq.test2;

public class Coordinate {
	
	// 필드
	int x, y;
	
	// 생성자
	public Coordinate() {}

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 메소드
	void output() {
		System.out.println("중심좌표 [" + x + " , " + y + "]");
	}
	
}
