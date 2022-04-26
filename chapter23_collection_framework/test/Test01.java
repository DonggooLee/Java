package org.ddongq.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
	Q1. Test01.java
	게시물을 저장하는 Board 클래스를 정의하고, ArrayList를 이용하여 3개의 게시물을 저장하시오.
	1~3번 게시물번호 중 하나를 입력 받아 해당 게시물을 삭제하시오.
	class Board			필드 : String title, String content, Date register
							  register -> 현재 날짜 자동 삽입
						메소드 : 생성자, toString()
*/

class Board {
	
	// 필드
	private String title, content;
	private Date register;
	
	// 생성자
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
		this.register = new Date();
	}

	@Override
	public String toString() {
//		StringBuffer sb = new StringBuffer();				// 문자열 연산이 많을땐 스티링 버퍼를 이용
//		sb.append("제목 : ").append(title).append("\n");
//		sb.append("내용 : ").append(content).append("\n");
//		sb.append("등록일 : ").append((new SimpleDateFormat("yyyy년 MM월 dd일 E요일")).format(register)).append("\n");
//		return sb.toString();
		
		String str = "";
		str += "제목 : " + title;
		str += ", 내용 : " + content;
		str += ", 등록일 : " + register;
		return str;
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Board> list = new ArrayList<Board>();		// 게시물을 저장하고 있는 클래스 타입으로 generic
		
		list.add(new Board("1. 공지사항", "모든 회원 필독"));	// 클래스이기 때문에 객체를 던져 준다
		list.add(new Board("2. 알림", "관리자만 필독"));
		list.add(new Board("3. 요청", "모든 회원 필독"));

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.print("1~3 게시물 중 삭제 할 게시물 번호 입력 : ");
		int num = sc.nextInt();
		list.remove(num-1);
		
		for(int i=0;i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		sc.close();
		
	}
}
