package org.ddongq.test;

/*
	Q2. Test02.java
	정수/실수 타입의 배열을 전달하면 해당 배열에 저장된 모든 요소의 합을 리턴하는 sum() 메소드를 구현하시오.
	예) int 5개 전달하면 5개의 합 출력
	★
	 - static <T extends Number> double sum(T[] arr)  형식 작성
	 	-> Number 형태의 데이터만 가능하다는 의미(int, long, float, double, byte, short)
	 - 배열의 값을 가져올때 배열.doubleValue()사용
	 	-> 배열인덱스.doubleValue()
*/

public class Test02 {
	// <T extends Number> 쓰는 이유는 Number를 상속받은 클래스만 할 수 있게 만들어준다?
	public static <T extends Number> double sum(T[] arr) {		// sum 이라는 메소드에 배열을 던져주었을 때 데이터 타입이 결정된다. <T extends Number>
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			// <T extends Number>를 사용했기떄문에 평소처럼 인덱스 값을 써도 바로 가져올수없음
			// 그래서 doubleValue()가 필요
			sum += (double)arr[i].doubleValue();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// 참조타입으로 만들기
		Integer[] arr1 = {1, 2, 3, 4 ,5};
		Double[] arr2 = {1.2, 3.14, 5.99};
		
		System.out.println("정수 베열의 총 합 : " + sum(arr1));
		System.out.println("실수 베열의 총 합 : " + sum(arr2));
		
		//Number 상속 : numericType만 가능하므로 String은 불가!
		String[] arr3 = {"홍길동","제갈길동","독고길동"};
		//System.out.println(sum(arr3));
	}
}
