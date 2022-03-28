package org.ddongq.ex;

class BankAccount{
	
	private String no;		// 계좌번호
	private long balance;	// 계좌잔액
	
	public BankAccount(String no, long balance) {
		this.no = no;
		this.balance = balance;
	}
	
	// 메소드
	// 1. 입금
	public void deposit(long money) throws DeposoiteException {
		if(money<0) {
			throw new DeposoiteException(1000, "0보다 작으면 입금 불가!");
		}
		balance += money;
	}
	// 2. 출금
	public void withdraw(long money) throws WithdrawException {
		if(money<0) {
			throw new WithdrawException(2000, "0보다 작으면 출금 불가!");
		}else if(money>balance) {
			throw new WithdrawException(2001, "잔액보다 크면 출금 불가!");
		}
		balance -= money;
	}
	// 3. 조회
	public void inquiry() {
		System.out.println("계좌번호 : " + no);
		System.out.println("잔액 : " + balance);
	}
	// 4. 이체
	public void transfer(BankAccount account, long money) throws DeposoiteException, WithdrawException {
		withdraw(money);
		account.deposit(money);
	}
	
}

class DeposoiteException extends Exception {
	private static final long serialVersionUID = 1L;
	private int errCode;
	public DeposoiteException(int errCode, String msg) {
		super(msg);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
}

class WithdrawException extends Exception {
	private static final long serialVersionUID = 1L;
	private int errCode;
	public WithdrawException(int errCode, String msg) {
		super(msg);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
}

public class Ex09_exception {
	public static void main(String[] args) {
		
		BankAccount parent = new BankAccount("123-456", 0);
		BankAccount child = new BankAccount("654-321", 0);
		
		try {
			parent.deposit(10000);
			parent.inquiry();
			parent.withdraw(5000);
			parent.inquiry();
			parent.transfer(child, 2000);
			parent.inquiry();
			child.inquiry();
			
		} catch (DeposoiteException e) {
			System.out.println("DepositeException 에러 메시지 : " + e.getMessage());
			System.out.println("코드 : " + e.getErrCode());
		} catch (WithdrawException e) {
			System.out.println("WithdrawException 에러 메시지 : " + e.getMessage());
			System.out.println("코드 : " + e.getErrCode());
		}
		
	}
}
