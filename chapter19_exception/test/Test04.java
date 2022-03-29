package org.ddongq.test;

/*
 Q4. Test04.java									   
주민등록 번호 (하이픈 포함)를 입력 받아 출력하시오.
주민등록번호가 14글자가 아니면 PerIDException 클래스를 이용하여 예외를 처리하시오.
주민등록번호를 입력받기 위해 getPerID() 메소드를 이용하시오.		
 */

class PerIDException extends Exception {
	private static final long serialVersionUID = 1L;
	public PerIDException(String msg) {
		super(msg);
	}
}

public class Test04 {
	
	public static void getPerID(String sn) throws PerIDException {
		if(sn.length()!=14) {
			throw new PerIDException("올바른 주민등록 번호가 아닙니다");
		}
	}
	
	public static void main(String[] args) {
		try {
			getPerID("888888-8888");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
