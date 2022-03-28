package org.ddongq.ex;

/* Ex09_exception 확장 버전
 * BankAccountException : DepositException 과 WithdrawException 의 부모클래스
 * DepositException : 마이너스 입금 처리, 예외 코드 1000
 * WithdrawException : 	잔액초과 출금 처리, 예외 코드 2000
 * 						마이너스 출금 처리, 예외 코드 2001
 * 
 * 		Exception					Exception(String message) { }
 * 
 * 		↑
 * 
 * 		BankAccountException		BankAccountException(int errCode, String message) {
 * 										super(message);		// Exception(String message) { }
 * 										this.errCode = errCode;
 * 									}
 * 		↑	↑
 * 		│ 
 * 		│	DepositException		DepositException(int errCode, String message) {
 * 		│								super(errCode, message);	// BankAccountException(errCode, message);
 * 		│							}
 * 		
 * 		WithdrawException			WithdrawException(int errCode, String message) {
 * 										super(errCode, message);	// BankAccountException(errCode, message);
 * 									}
 * 
 */

class BankAccount2 {
	
	// Field
	private String no;
	private long balance;
	
	// Constructor
	public BankAccount2(String no, long balance) {
		this.no = no;
		this.balance = balance;
	}
	
	// Method
	// 1. 입금
	public void deposit(long money) throws DepositException2 {
		if (money < 0) {
			throw new DepositException2(1000, "0보다 작으면 입금 불가!");
		}
		balance += money;
	}
	// 2. 출금
	public void withdraw(long money) throws WithdrawException2 {
		if (money > balance) {
			throw new WithdrawException2(2000, "잔액보다 크면 출금 불가!");
		} else if (money < 0) {
			throw new WithdrawException2(2001, "0보다 작으면 출금 불가!");
		}
		balance -= money;
	}
	// 3. 조회
	public void inquiry() {
		System.out.println("계좌번호 : " + no);
		System.out.println("계좌잔액 : " + balance);
	}
	// 4. 이체
	public void transfer(BankAccount2 account, long money) throws DepositException2, WithdrawException2 {
		withdraw(money);
		account.deposit(money);
	}
	
}

class BankAccountException extends Exception {
	private static final long serialVersionUID = 1L;
	private int errCode;
	public BankAccountException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
}

class DepositException2 extends BankAccountException {
	private static final long serialVersionUID = 1L;
	public DepositException2(int errCode, String message) {
		super(errCode, message);
	}
}

class WithdrawException2 extends BankAccountException {
	private static final long serialVersionUID = 1L;
	public WithdrawException2(int errCode, String message) {
		super(errCode, message);
	}
}

public class Ex10_BankAccount {
	public static void main(String[] args) {
		
		BankAccount2 parent = new BankAccount2("123-456", 10000);
		BankAccount2 child = new BankAccount2("654-321", 0);
		
		try {
			parent.deposit(100000);
			parent.inquiry();
			parent.withdraw(10000);
			parent.inquiry();
			parent.transfer(child, 5000);	// parent -> child 에게 5000 이체
			parent.inquiry();
			child.inquiry();
		} catch (BankAccountException e) {	// 그냥 Exception을 써도 되지만 그러면 ↓ 에러코드가 처리가안됨
			System.out.println("에러 메시지 : " + e.getMessage() + "(코드 : " + e.getErrCode() + ")");
		}
		
	}
}
