package org.ddongq.ex;

import java.util.Arrays;

public class Ex05_String {
	public static void main(String[] args) {
		
		// String 은 참조타입! => 참조타입은 주소값을 가지고 있다 그래서 값이 동일한 경우 동일한 주소를 공유한다 
		String a = "apple";		// 인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 생성
		String b = "apple";		// "apple"은 하나만 만들어진다
		System.out.println(a==b ? "apple 1개" : "apple 2개");	// 같은 주소를 참조하고 있기 때문에 하나라고 판단
		
		String c = new String("banana");	// 새로운 객체를 생성했기 때문에 각자 새로운 주소를 가지고 있다
		String d = new String("banana");
		System.out.println(c==d ? "banana 1개" : "banana 2개");
		
		// .split
		String sn = "000000-1234567";
		String[] snArr = sn.split("-");
		System.out.println(Arrays.toString(snArr));

		String today = "2022.03.29";
		String[] ymd = today.split("\\.");
		// 특수문자 사용 시 (\\)2개 붙여줘야함 : | ? * ( ) [ ] { } \ 
		System.out.println(ymd[0] + "년" + ymd[1] + "월" + ymd[2] + "일");
		
		// .join
		// 2022-03-29
		String today2 = String.join("-", ymd);
		System.out.println(today2);
		
		// .substring()
		// .substring(시작 인덱스)					: 시작 인덱스 부터 끝까지 추출
		// .substring(시작 인덱스, 종료 인덱스)		: 시작 인덱스 포함, 종료전까지 추출

		String phone = "010-1234-5678";
		String phone1 = phone.substring(0, 3);
		System.out.println(phone1);
		String phone2 = phone.substring(4, 8);
		System.out.println(phone2);
		String phone3 = phone.substring(9);
		System.out.println(phone3);
		
	}
}
