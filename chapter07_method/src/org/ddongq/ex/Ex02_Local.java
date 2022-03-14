package org.ddongq.ex;

//국내에 거주하는 사람
public class Ex02_Local {
	
	String name; 		// 이름
	String sn;			// 주민번호
	int age;			// 나이
	boolean isKorean;	// 한국인 유무
	
	// 입력 메소드 2개
	void setLocalInfo(String _name, int _age, String _sn) {
//		name = _name;
//		age = _age;
		setLocalInfo(_name, _age); // 아래 메소드와 중복되는 부분은 이렇게 정리 가능
		sn = _sn;
		isKorean = sn.charAt(7) <= '4' ? true : false;
	}
	void setLocalInfo(String _name, int _age) {
		name = _name;
		age = _age;
	}
	
	// 출력 메소드 1개
	// 이름, 나이, 주민번호(있으면 그대로 출력 , 없으면 없으로 출력), 한국인 or 외국인
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민번호 : " + (sn==null ? "없음" : sn)); // sn값이 null 일때 값을 처리하기 위해 작성
																  // if 문으로 작성 가능
		System.out.println(isKorean? "한국인":"외국인");
	}
	
}
