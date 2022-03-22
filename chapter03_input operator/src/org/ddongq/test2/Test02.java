package org.ddongq.test2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		age = sc.nextInt();
		
		System.out.println((age>=18) ? "성인" : "미성년자");
		
		/*
		String result = "";
		if(age>=20) {
			result = "성인";
		}else {
			result = "미성년자";
		}
		System.out.println(result);
		*/
		
		sc.close();
	}
}
