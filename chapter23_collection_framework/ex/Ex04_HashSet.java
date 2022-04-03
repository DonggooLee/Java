package org.ddongq.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex04_HashSet {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("C");
		set.add("Spring");
		set.add("Java");
		set.add("DB");
		set.add("JSP");
		set.add("Wdb");
		set.add("Java");
		// 중복된 값이 저장되지 않는다!
		System.out.println(set);
		
		// Iterator 객체를 이용하여 Spring인 내용을 삭제 후 set 내용 출력
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("Spring")) {
				itr.remove();
			}
		}

		// set.remove("Spring");	// Set을 이용한 특정 객체 삭제 방법
		// ser.removeAll(set);		// Set을 이용한 전체 객체 삭제 방법
		System.out.println(set);
		
	}
}
