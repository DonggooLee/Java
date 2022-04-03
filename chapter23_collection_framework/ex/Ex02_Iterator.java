package org.ddongq.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02_Iterator {
	public static void main(String[] args) {
		
		// list 객체 생성하여 10, 20, 30, ... , 100 까지 저장하기
		List<Integer> list = new ArrayList<Integer>();

//		for(int i=1; i<=10; i++) {
//			list.add(i*10);
//		}
		
		for(int i=10; i<=100; i+=10) {
				list.add(i);
		}
		
		// 반복자 호출 <동일한 참조타입으로 설정>
		Iterator<Integer> itr = list.iterator(); // 리스트에서 호출한걸 itr에 입력해준다
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		// next() 메소드를 호출하면 일회용이라 다시 사용할 수 없다!
		// 아래와 같이 한번더 .iterator() 호출해야 사용할 수 있다.
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
