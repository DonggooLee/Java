package org.ddongq.ex;

/*
 * 예외 클래스 : Exception을 상속 받아서 만든다. (Custom Exception)
 * 예외 클래스를 만드는 이유 : 사용자 친화적인 예외 메세지로 변경 가능, 예외가 아닌것도 예외로 만들 수 있다.
 */

class MyException extends Exception { 
	
	private static final long serialVersionUID = 1L;	// 경고 없애려고 사용 아직은 몰라도 됨...

	public MyException(String msg) {
		super(msg);
	}
	
}

public class Ex08_exception {
	public static void main(String[] args) {
		
		try {
			throw new MyException("내가 만든 예외!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
