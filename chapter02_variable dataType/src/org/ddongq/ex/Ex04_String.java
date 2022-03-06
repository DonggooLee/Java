package org.ddongq.ex;

public class Ex04_String {
	public static void main(String[] args) {
		String str1 = "Java";
		System.out.println(str1.toLowerCase());		// 기존 문자열을 소문자로 반환
		System.out.println(str1.toUpperCase());		// 기존 문자열을 대문자로 반환
		System.out.println(str1.indexOf('v'));		// 지정문자의 index 번호 반환
		System.out.println(str1.charAt(2));			// 지정 index의 문자 반환
		System.out.println(str1.startsWith("J"));   // 지정된 문자열로 시작하는지 (boolean)
		System.out.println(str1.endsWith("a"));     // 지정된 문자열로 끝나는지 (boolean)
		System.out.println(str1.contains("a"));    	// 지정된 문자열을 포함하는지 (boolean)
		System.out.println(str1.substring(1)); 		// 지정한 index부터 모든 문자들을 반환
		System.out.println(str1.substring(1, 3));   // 지정한 첫번째 index부터 두번째 index 직전 까지의 문자들을 반환
		
		String str2 = "   Java   ";			
		System.out.println("*"+str2.trim()+"*");    // 문자열의 양쪽 공백을 제거
		
		String str3 = "Ja-va";
		String[] s=str3.split("-"); 				// 지정한 문자로 분리하여 배열로 반환
		System.out.println(s.length);
		
		if(str1.equals(str2)){						//  두개의 문자열 비교 (boolean)
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		String str4;
		System.out.println(str4.isEmpty());		// 메서드 사용 불가(초기화 필요)
		
		String str5 = "";
		System.out.println(str5.isEmpty());   	// 문자열 변수의 값이 있는 지 (boolean)
		
		String str6 = null;
		System.out.println(str6.isEmpty());		// 실행후, NullPointer 에러 발생
	}
}
