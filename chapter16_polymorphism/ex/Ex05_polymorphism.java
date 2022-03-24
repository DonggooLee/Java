package org.ddongq.ex;

class Car{
	public void drive() {
		System.out.println("달린다");
	}
}

class Ev extends Car{
	public void charging() {
		System.out.println("전기 충전한다.");
	}
}

class Hybrid extends Ev{
	public void addOil() {
		System.out.println("기름 주유한다");
	}
}

public class Ex05_polymorphism {
	public static void main(String[] args) {
		
		Car[] moters = new Car[2];
		
		// 업캐스팅
		moters[0] = new Ev(); 
		moters[1] = new Hybrid();
		
		
		moters[0].drive();
		if(moters[0] instanceof Ev) {	// 다운 캐스팅
			Ev car1 = (Ev)moters[0];
			car1.charging();
//			((Ev)moters[0]).charging();
		}else {
			System.out.println("다운 캐스팅 실패!");
		}
		
		System.out.println("------------------------");
		
		moters[1].drive();
		if(moters[1] instanceof Hybrid) {	// 다운 캐스팅
			Hybrid car2 = (Hybrid)moters[1];
			car2.addOil();
//			다운 캐스팅을 했으면 원래의 부모것을 사용할 수 있다.
			car2.charging();
		}
		
		
	}
}
