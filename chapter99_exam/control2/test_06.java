package org.ddongq.control2;

public class test_06 {
	public static void main(String[] args) {
		
		// i는 첫 번째 주사위
		for(int i=1; i<=6; i++) {
			// j는 두 번째 주사위
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.println("첫번째 주사위 눈금 : "+ i +", 두번째 주사위 눈금 : " + j);
				}
			}
		}
		
	}
}
