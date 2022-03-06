package org.ddongq.ex;

public class Ex01_if {
	public static void main(String[] args) {
		/*
		 * 	1. 형식
		 * 
		 * 		if (조건식) {
		 * 			실행문;
		 * 		}
		 * 
		 *  
		 *  	if (조건식) {
		 *  		실행문;
		 *  	} else{
		 *  		실행문;
		 *  	}
		 *  
		 *  
		 *  	if(조건식) {
		 * 			실행문;
		 * 		} else if(조건식){
		 * 			실행문;
		 * 		} else{
		 * 			실행문;
		 *  	}
		 *  
		 *  
		 *  2. 특징
		 *   1) else if 문은 없어도 되고, 여러 개가 있을 수 있다.
		 *   2) else 문은 없어도 되고, 한 개가 있을 수 있다.
		 *   3) 실행문이 하나라면 실행블록의 중괄호({}) 생략할 수 있다.
		 */  
		
		/*
		 * 1. 예제
		 * 
		 *	if(조건식) {
		 * 		실행문;
		 * 	} else if(조건식){
		 * 		실행문;
		 *	} else if(조건식){
		 * 		실행문;
		 * 	} else{
		 * 		실행문;
		 * 	}
		 * 
		 *	if(조건식) {
		 * 		실행문;
		 * 	}
		 * 
		 * 	if(조건식)
		 * 		실행문;
		 * 
		 * */
		
		int num = 20;
		
		if(num>0) {
			System.out.println("양수");
		}else if(num<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
		
		double avg = 77.4;
		
		if(avg >= 90) {
			System.out.println("A");
		}else if(avg >= 80) {
			System.out.println("B");
		}else if(avg >= 70) {
			System.out.println("C");
		}else if(avg >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
	}
}