package org.ddongq.test;

/*
	Q4. Test04.java
	interface Car					메소드 : info();
	class Bus implements Car
	class CityTourBus extends Bus
	class SeoulBus extends Bus
	class Taxi implements Car
	Class Bicycle
	Class Test04					메소드 : static <T extends Car> onlyCar(T car) 
	- CityTourBus, SeoulBus, Taxi 정보 출력
*/

interface Car {
	void info();
}

class Bus implements Car {
	@Override
	public void info() {
		System.out.println("버스");
	}
}

class cityTourBus extends Bus {
	@Override								// 여기서 오버라이드 되는 이유는 부모클래스가 Car를 구현 했기 때문에
	public void info() {
		System.out.println("시티투어 버스");
	}
}

class SeoulBus extends Bus {				// 여기서 오버라이드 되는 이유는 부모클래스가 Car를 구현 했기 때문에
	@Override
	public void info() {
		System.out.println("서울버스");
	}
}

class Taxi implements Car {					
	@Override
	public void info() {
		System.out.println("택시");
	}
}

class Bicycle {
	public void info() {
		System.out.println("자전거");
	}
}


public class Test04 {
	// <T extends Car> 쓰는 이유는 Car를 상속받은 클래스들만 할 수 있게 만들어준다?
	// type의 T number N 
	public static <T extends Car> void onlyCar(T car) {
		car.info();
	}
	
	public static void main(String[] args) {
	
		onlyCar(new cityTourBus());				// onlyCar(T car)에 new cityTourBus를 생성해주면 된다
		System.out.println("------------");
		onlyCar(new SeoulBus());
		System.out.println("------------");
		onlyCar(new Taxi());
		
	}
	
}
