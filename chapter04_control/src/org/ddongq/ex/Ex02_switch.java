package org.ddongq.ex;

public class Ex02_switch {
	public static void main(String[] args) {
		/*
		 * 1. 형식
		 * 		switch (표현식){
		 * 			case 값1 : 실행문; 
		 * 				  break; // 브레이크가 없으면 다음것도 계속 탄다.
		 * 			case 값2 : 실행문;
		 * 				  break;
		 * 			default : 실행문;
		 * 		}
		 * 
		 * 2. 특징
		 * 	1) 표현식의 결과는 정수,문자,문자열만 가능하다. 실수는 불가능!!
		 *  2) 실제 사용 예시
		 *  
		 *  	switch (var){
		 *  		case >= 10 : 	// 불가능!
		 *  		case 10 : 		// 가능!		(정수)
		 *  		case 1.5 : 		// 불가능!	(실수)
		 *  		case '남' : 		// 가능!		(문자)
		 *  		case "admin" : 	// 가능!		(문자열)
		 *  	}
		 */
		
		int age = 25;
		
		// if
		
		if(age >= 20) {
			// 성인
		}else {
			// 미성년자
		}
		
		int ckAge = age/10;
		switch(ckAge) { 
			case 1 : System.out.println("미성년자");
				break;
			case 2 : System.out.println("성인");
				break;
		}
		
		String gender = "남자";
		switch (gender) {
		case "남자" : //~~~
			break;
		
		case "여자" : //~~~
			break;
		}
		
		if(gender.equals("남자")) {
			
		}else {
			
		}
		
		
	}
}
