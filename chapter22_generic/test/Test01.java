package org.ddongq.test;

import java.util.Arrays;

/*
	Q1. Test01.java
	문자/정수/실수 타입의 배열을 전달하고 데이터 타입을 체크하여
	해당 데이터 타입과 해당 배열의 데이터들을 출력
	class TypeCheckClass - 필드 : T[] arr
	   			  		   메소드 : String checkType(T[] arr), toString()
*/

class TypeCheckClass<T> {
	
	// 필드
	private T[] arr;
	
	// 메소드
	public String checkType(T[] arr) {
//		System.out.println(Arrays.toString(arr));
		this.arr = arr;	
		String A = "";
		if(arr instanceof String[]) {
			A = "문자열";
		}else if(arr instanceof Double[]) {
			A = "실수";
		}else if(arr instanceof Integer[]) {
			A = "정수";
		}
		return A;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		
		Integer[] arr1 = {11,22,33,44,55};
		Double[] arr2 = {1.5,2.5,3.5};
		String[] arr3 = {"Hello", "world"};
		
		TypeCheckClass<Integer> typeCheckClass1 = new TypeCheckClass<>();
		TypeCheckClass<Double> typeCheckClass2 = new TypeCheckClass<>();
		TypeCheckClass<String> typeCheckClass3 = new TypeCheckClass<>();
		
		System.out.println("데이터 타입 : " + typeCheckClass1.checkType(arr1) + ", 출력된 결과 : " + typeCheckClass1.toString());
		System.out.println("데이터 타입 : " + typeCheckClass2.checkType(arr2) + ", 출력된 결과 : " + typeCheckClass2.toString());
		System.out.println("데이터 타입 : " + typeCheckClass3.checkType(arr3) + ", 출력된 결과 : " + typeCheckClass3.toString());
		
	}
}
