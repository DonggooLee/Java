package org.ddongq.ex;

class Car{
	void expensive() {							// 부모, 자식 다 가능한 것
		System.out.println("비싸다");
	}
}

class Ev extends Car{
	void chargingTime() {						// 자식만 할 수 있음
		System.out.println("전기를 충전한다");
	}
}


public class Ex03_inheritance {
	public static void main(String[] args) {
		
		Ev evCar = new Ev();
		evCar.expensive();
		evCar.chargingTime();
		
	}
}
