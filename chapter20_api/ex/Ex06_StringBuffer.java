package org.ddongq.ex;

public class Ex06_StringBuffer {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("apple");
		StringBuffer sb2 = new StringBuffer("apple");
		
		System.out.println("sb1의 해시코드값(주소값) : " + sb1.hashCode());
		System.out.println("sb2의 해시코드값(주소값) : " + sb2.hashCode());
		
		StringBuffer sb = new StringBuffer();
		System.out.println("기본 버퍼 크기 : " + sb.capacity());
		// .capacity() : 버퍼크기 알아볼 때 사용 -> 기본 16문자 저장
		
		sb.append("hello");
		sb.append(" world").append(" !!!");		// chaining 기법 : 계속 이어서 값 추가
		System.out.println(sb);
		
		// 삭제
		StringBuffer phone = new StringBuffer();
		phone.append("010-1234-5678");
		phone.deleteCharAt(3);					// 삭제할 인덱스 입력
		phone.deleteCharAt(7);					// (-) 이 삭제되어서 인덱스 값 변경
		System.out.println(phone);
		
	}
}
