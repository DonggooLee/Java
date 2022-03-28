package org.ddongq.test;

class Phone {
	private String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	public void sendCall() {
		System.out.println(owner + " 전화걸기");
	}
	public void receiveCall() {
		System.out.println(owner + " 전화받기");
	}
}

interface Computable {
	void connectInternet();
	void playApp();
}

class SmartPhone extends Phone implements Computable {
	public SmartPhone(String owner) {
		super(owner);
	}
	@Override
	public void connectInternet() {
		System.out.println("인터넷 연결");
	}
	@Override
	public void playApp() {
		System.out.println("어플 실행");
	}
}

public class Test01 {
	public static void main(String[] args) {
		
		SmartPhone p = new SmartPhone("김씨");
		p.sendCall();
		p.receiveCall();
		p.connectInternet();
		p.playApp();
		
	}
}
