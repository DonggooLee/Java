package org.ddongq.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex07_HashMap {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 추가 : .put(key, value)
		map.put("할머니", 120);
		map.put("할아버지", 110);
		map.put("엄마", 70);
		map.put("아빠", 60);
		map.put("동생", 3);
		map.put("동생", 10);		// key 중복 발생! (중복된 key를 삽입하려고 하면, 기존 value값이 수정된다.)
		System.out.println("entry 개수 (전) : " + map.size());
		System.out.println("할머니 지우기 전 : " + map);
		// 삭제 : .remove(key)
		map.remove("할머니");
		// 크기 확인 : .size();
		// 키가 중요 ! <순서상관 X>
		System.out.println("entry 개수 (후) : " + map.size());
		System.out.println("할머니 지우기 후 : " + map);
		System.out.println("----------------------");
		
		// 반복자는 key를 통해서 순회한다. (반복자 타입 == key의 타입)
		// 1번 = map의 key를 set에 저장한다.
		// 2번 = map에서 key만 빼서 순회한다.
		// .keySet() => "키" 만을 모아서 출력하는 메소드
		// "키"는 String 형식이기 때문에 Set, Iterator 역시 String 제네릭으로 설정!
		Set<String> set = map.keySet();		// 1번 map 이 가지고 있는 키 값을 set에 저장!
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);	// 2번 키를 호출하면 values 값을 넘겨주기 때문에!
			System.out.println("이름 : " + key + ", 나이 : " + value);
		}
		System.out.println("----------------------");
		
		// itr을 순회하고 나면 사용된 itr은 재사용이 불가하다.
		// set은 가만히 있기 때문에 itr만 다시 설정해주면 된다. (없을경우 값이 안나옴)
		itr = set.iterator();	
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);
			System.out.println("이름 : " + key + ", 나이 : " + value);
		}
		System.out.println("----------------------");
		
		// 컬랙션은 그냥 출력이 가능
		System.out.println(map);			// 키=값  형태의 배열
		map.clear();						// map 모든 객체 삭제
		System.out.println(map);
		
	}
}
