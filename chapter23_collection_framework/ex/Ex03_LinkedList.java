package org.ddongq.ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03_LinkedList {
	public static void main(String[] args) {
		
		/*
		 * ArrayList와 LinkedList 성능 비교
		 * 10000개의 객체를 0번 인덱스에 삽입하는데 걸리는 시간을 측정
		 */

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// ArrayList
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));	// i값이 int 형식이기 때문에 valueof 사용
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + " ns");
		
		// LinkedList
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));	// i값이 int 형식이기 때문에 valueof 사용
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + " ns");
		
	}
}
