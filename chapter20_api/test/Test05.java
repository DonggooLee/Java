package org.ddongq.test;

import java.util.Scanner;

/*
성(lastName), 이름(firstName)을 각각 입력 받아
하나의 이름(fullName)을 완성하시오. StringBuffer 클래스를 이용하시오.
위의 방식으로 두 이름을 입력 받아 두 이름(fullName)의 동등 비교를 진행하시오.
 */

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 첫 번째 sb1
		StringBuffer sb1 = new StringBuffer();
		System.out.println("성(lastName) : ");
		String lastName = sc.next();
		System.out.println("이름(firstName) : ");
		String firstName = sc.next();
		sb1.append(lastName).append(firstName);
		System.out.println(sb1);
		
		// 두 번째 sb2
		StringBuffer sb2 = new StringBuffer();
		System.out.println("성(lastName) : ");
		lastName = sc.next();
		System.out.println("이름(firstName) : ");
		firstName = sc.next();
		sb2.append(lastName).append(firstName);
		System.out.println(sb2);
		
		if(sb1.toString().equals(sb2.toString())) {		// sb는 객체기때문에 문자열 비교를 위해서 toString 필수!
			System.out.println("같은 이름");
		}else {
			System.out.println("다른 이름");
		}
		
	}
}
