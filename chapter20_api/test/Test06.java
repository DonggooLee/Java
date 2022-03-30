package org.ddongq.test;

import java.math.BigInteger;

/*
1! ~ 99! 까지 전체 결과를 출력하시오.
1! (1 팩토리얼) = 1
2! (2 팩토리얼) = 1 * 2 = 2
3! (3 팩토리얼) = 1 * 2 * 3 = 6
4! (4 팩토리얼) = 1 * 2 * 3 * 4 = 24
...
n!: (n-1) * n

ex)
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
...
99!
*/

public class Test06 {
	public static void main(String[] args) {
		
//		long num = 1;
//		for(int i=1; i<100; i++) {
//			num = num * i;
//			System.out.println((i)+"! = "+num);
//		}
		
		BigInteger bigNum = new BigInteger("1");
		for(int i=1; i<100; i++) {
			bigNum = bigNum.multiply(BigInteger.valueOf(i));
			System.out.println((i)+"! = "+bigNum);
		}
		
		// 선생님 문제풀이
		BigInteger sum = null;
		for(int i=1; i<100; i++) {
			sum = new BigInteger("1");
			System.out.print(i+"! = ");
			
			for(int j=1; j<i; j++) {
				sum = sum.multiply(BigInteger.valueOf(j)); 
			}
			System.out.println(sum);
		}
		
	}
}
