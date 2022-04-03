package org.ddongq.ex;

/*
 * T[] arr; 			 가능(선언) : 4byte
 * T[] arr = new T[3];	 불가능 : T의 크기를 모름
 * T obj = new T();		 불가능 : T의 크기를 모름
 */

import java.util.Arrays;

public class Ex03_generic {
	
	// 제네릭 메소드
	public static <T> void printArray(T[] arr) {		// <T> 위치를 확인하자!
		System.out.println(Arrays.toString(arr));		// 배열 값 전체 출력
	}
	
	public static void main(String[] args) {
		
		// 정수형 배열 1,2,3,4,5
		// 실수형 배열 1.5,2.5,3.5
		// 문자형 배열 "Hello", "world"
		
		// 제네릭은 참조타입만 받기 때문에 int, double 기본타입으로 만들면 되지 않는다!
		// 코드도 효율적으로 사용할 수 있다.
		
		Integer[] arr1 = {1,2,3,4,5};
		Double[] arr2 = {1.5,2.5,3.5};
		String[] arr3 = {"Hello", "world"};
		
		printArray(arr3);
		printArray(arr2);
		printArray(arr1);
		
	}
	
}
