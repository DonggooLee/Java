package org.ddongq.ex;

public class Ex04_System {
	public static void main(String[] args) {
		
		// 1~10까지의 수를 출력하는 중에
		// 5 까지만 출력하고 프로그램 종료
		
		for(int i=1; i<=10; i++) {
			
			// i 값 출력
			System.out.println(i);
			try {
				if(i==5) {
					// 프로그램 종료(JVM 종료)
					System.exit(i);
				}
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
				
	}
}
