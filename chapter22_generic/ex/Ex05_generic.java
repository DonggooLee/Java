package org.ddongq.ex;

import java.util.Arrays;

class Container <T> {
	
	private T[] items;

	@SuppressWarnings("unchecked")			 // 명확하지 않는 타입으로 체크되지만 경고는 무시하겠다는 어노테이션
	public Container(int capacity) {		 // capacity : 생산력, 수용능력
		items = (T[])(new Object[capacity]); // 어떤 형태인지 모르기 때문에 오브젝트로 받고 형변환해서 다운캐스팅
	}
	
	public void add(T item) {
		// 순차적으로 순회하다가 빈자리가 발견되면 그 자리에 저장한다.
		// items 배열에 item 변수 정장하기
		for(int i=0; i<items.length; i++ ) {
			if(items[i]==null){
				items[i] = item;
				break;		// 하나만 넣고 빠질거기 떄문에 break 해준다.
				// break 하지 않으면 (54번째 줄) 하나의 타입이 배열의 갯수 만큼 계속 들어가기 떄문
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
		
		Container<Gun> container = new Container<Gun>(10);
		
		container.add(new Gun("M16"));
		container.add(new Gun("K2"));
		container.add(new Gun("AK47"));
		container.add(new Gun("안녕"));
		container.add(new Gun("AK47"));
		
		System.out.println(Arrays.toString(container.getItems()));	// 아이템 배열에 들어 있는 모든 값들을 꺼내온다
		
	}
}
