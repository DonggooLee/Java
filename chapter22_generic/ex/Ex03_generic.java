package org.ddongq.ex;

/*
 * T[] arr; 			 가능(선언) : 4byte
 * T[] arr = new T[3];	 불가능 : T의 크기를 모름
 * T obj = new T();		 불가능 : T의 크기를 모름
 */

import java.util.Arrays;

public class Ex03_generic {
	
	// 제네릭 메소드 => 없었으면 배열의 데이터타입에 따른 오버로딩된 메소드 3개가 각각 있었어야 한다.
	// 타입이 뭐든 하나로 퉁칠수 있다.
	public static <T> void printArray(T[] arr) {		// <T> 위치를 확인하자!
		System.out.println(Arrays.toString(arr));		// 배열 값 전체 출력
	}
	
	public static void main(String[] args) {
		
		// 정수형 배열 1,2,3,4,5
		// 실수형 배열 1.5,2.5,3.5
		// 문자형 배열 "Hello", "world"
		
		// 제네릭은 참조타입만 받기 때문에 int, double 기본타입으로 만들면 되지 않는다!
		// 코드도 효율적으로 사용할 수 있다.
		
		Integer[] intarr = {1,2,3,4,5};
		Double[] douarr = {1.5,2.5,3.5};
		String[] strarr = {"Hello", "world"};
		
		printArray(strarr);
		printArray(douarr);
		printArray(intarr);
		
	}
	
}
