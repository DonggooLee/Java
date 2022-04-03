package org.ddongq.ex;

import java.util.Arrays;

class Container <T> {
	
	private T[] items;
	// Gun[] items = new Gun[10];

	@SuppressWarnings("unchecked")			 // 명확하지 않은 타입 체크지만 더이상 경고 날리지마라!
	public Container(int capacity) {		 // capacity : 생산력, 수용능력
		items = (T[])(new Object[capacity]); // 어떤 형태인지 모르기 때문에 오브젝트로 받고 형변환해서 다운캐스팅
	}
	
	public void add(T item) {
		// 순차적으로 순회하다가 빈자리가 발견되면 그 자리에 저장한다.
		// items 배열에 item 변수 정장하기
		for(int i=0; i<items.length; i++ ) {
			if(items[i]==null){
				items[i] = item;
				break;
			}
		}
	}

	public T[] getItems() {
		return items;
	}
	
}

class Gun {
	
	private String model;

	public Gun(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return model;
	}

}

public class Ex05_generic {
	public static void main(String[] args) {
		
		Container<Gun> container = new Container<>(10);
		
		container.add(new Gun("M16"));
		container.add(new Gun("K2"));
		container.add(new Gun("AK47"));
		
		System.out.println(Arrays.toString(container.getItems()));
		
	}
}
