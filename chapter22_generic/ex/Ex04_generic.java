package org.ddongq.ex;

class Room<T1, T2> { 
	
	private T1 furniture1;
	private T2 furniture2;
	
	public void setFurniture1(T1 furniture1) {
		this.furniture1 = furniture1;
	}
	public void setFurniture2(T2 furniture2) {
		this.furniture2 = furniture2;
	}
	
	@Override
	public String toString() {
		// StringBuffer를 이용하여
		// "첫번째 가구 ~ 두번째 가구 ~" 출력
		StringBuffer sb = new StringBuffer();
		sb.append("첫번쩨 가구 : ").append(furniture1).append("\n");
		sb.append("두번째 가구 : ").append(furniture2);
		return sb.toString();
		// sb의 StringBuffer 타입을 String으로 toString()을 이용하여 변환시킨다.
	}
	
}

class Chair {
	@Override
	public String toString() {
		return "의자";
	}
}

class Table {
	@Override
	public String toString() {
		return "책상";
	}
}

class Bed {
	@Override
	public String toString() {
		return "침대";
	}
}

class DressTable {
	@Override
	public String toString() {
		return "화장대";
	}
}

public class Ex04_generic {
	public static void main(String[] args) {
		
		Room<Bed, DressTable> room1 = new Room<>();

		room1.setFurniture1(new Bed());
		room1.setFurniture2(new DressTable());
		
		System.out.println(room1);
		
		Room<Chair, Table> room2 = new Room<>();
		
		room2.setFurniture1(new Chair());
		room2.setFurniture2(new Table());
		
		System.out.println(room2);
		
		
	}
}
