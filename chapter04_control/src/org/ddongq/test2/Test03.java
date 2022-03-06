package org.ddongq.test2;

public class Test03 {
	public static void main(String[] args) {
//		Q. 전체 구구단 출력하기_1
//		ex) 2x1 = 2
//			2x2 = 4
//			...
//			9x9 = 81
			
        for(int k=2; k<10; k++) {
            for(int l=1; l<10; l++) {
                System.out.println(k +" X "+ l +" = "+ (k*l));
            }
            System.out.println(); 
        }
	}
}
