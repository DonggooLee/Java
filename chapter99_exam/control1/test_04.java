package org.ddongq.control1;

public class test_04 {
	public static void main(String[] args) {
		
//		Q4. num이라는 변수에 120이라는 숫자를 초기화 한 후에 이 숫자가 
//		양수인지, 음수인지, 짝수인지, 홀수인지 출력
		
		int num = 120;
		
		if(num%2==0) {
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
		
		if(num>0) {
			System.out.println("양수");
		}else{
			System.out.println("음수");
		}
		
	}
}
