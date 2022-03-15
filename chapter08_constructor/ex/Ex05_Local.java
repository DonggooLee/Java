package org.ddongq.ex;

public class Ex05_Local {
	 /*
	 * Ex05_Local.java
	 * 
	 * 필드
	 *  - 이름 name
	 *  - 나이 age
	 *  - 주민등록번호 sn
	 *  - 한국인 판단 isKorean
	 *  
	 * 메소드
	 *  - 기본생성자(constructor)
	 *  - 이름, 나이, 주민등록번호 초기화 생성자 => 주민등록 번호 뒷자리 이용하여 한국인 판단
	 *  - 이름, 나이 초기화 생성자
	 *  - 이름, 나이, 주민등록번호, 한국인 유무 출력
	 */

	String name, sn;
	int age;
	boolean isKorean;
	
	public Ex05_Local() {
		
	}
	
	public Ex05_Local(String name, int age, String sn) {
		this.name = name;
		this.age = age;
		this.sn = sn;
		isKorean = sn.charAt(7) <= '4' ? true : false;
	}
	
	public Ex05_Local(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민번호 : " + (sn==null ? "없음" : sn));
		System.out.println("한국인 유무 : " + (isKorean? "한국인" : "외국인"));
	}
	
}
