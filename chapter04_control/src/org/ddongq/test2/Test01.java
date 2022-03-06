package org.ddongq.test2;

public class Test01 {
	public static void main(String[] args) {
//		Q. 10 ~ 1 역순으로 출력하기
		
		
		// 1. for (초기값; 조건; 증감 )
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// 2. while
		int j = 10;
		while (j>=1) {
			System.out.println(j);
			j--;
		}
		
	}
}
