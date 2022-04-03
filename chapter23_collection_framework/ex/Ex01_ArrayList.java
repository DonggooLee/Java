package org.ddongq.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		
		// 제네릭은 기본타입 X 참조타입 O
		List<Integer> list = new ArrayList<Integer>();	// ()안에 초기사이즈 설정가능 (업캐스팅)
		// ArrayList<Integer> list = new ArrayList<Integer>();
		// ArrayList만 가지고 있는 메소드를 사용할때 사용 (일반적으로 List 사용)
		
		// 1. 저장 : .add()
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(5);
		list.add(4);
		list.add(3);
//		list.add(5, 2);		인덱스를 지정해서 값을 넣는게 가능
		
		// 2. 저장된 요소 가져오기 : .get()
		System.out.println("첫 번째 요소 : " + list.get(0));	// .get(인덱스 번호)
		
		// 3. 크기 : .size() <-> .length(일반배열)과 차이점
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 4. 삭제 : .remove(), clear()
		list.remove(0);		// 0번 인덱스 데이터 삭제
//		list.clear();		// 저장된 모든 객체를 삭제
		
		// 5. 확인 (저장 유무 확인) : .contains(객체)
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(new Integer(5));
		list2.add(new Integer(6));
		list2.add(new Integer(7));
		
		for(int i=0; i<list2.size(); i++) {
			if(list.contains(list2.get(i))) {
				System.out.println("중복되는 값 : " + list2.get(i));
			}
		}
		
		// 6. 출력 : 객체명만 입력해도 가능
		System.out.println("list : " + list);
		
		// 7. 정렬 : .sort()
		Collections.sort(list);		// sort는 static 메소드
		System.out.println("list : " + list);
		
		// 8. 최악(최고)의 성능이 나타나도록 list의 모든 데이터 삭제
		while(list.size()>0) {
			// 최악 (앞 인덱스 데이터가 삭제되면 뒤 인덱스 데이터 앞 인덱스로 이동된다)
			list.remove(0);
			// 최고
			list.remove(list.size()-1);	// 인덱스가 0부터 시작하기 때문에 -1 해줘야 한다
		}
		System.out.println("list : " + list);
		
	}
}
