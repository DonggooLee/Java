package org.ddongq.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/*
	Q2. Test02.java > Set 이용하기
	로또 & 빙고 (빙고가 어려우면 로또부터 해보기)
	Set을 이용하여 5 X 5 Bingo 배열을 생성하시오. (1 ~ 25)
	Set에 랜덤 생성 -> Bingo 2차원 배열에 저장 
 */

public class Test02 {

	public static void main(String[] args) {
		 
		// ★★★★★ << 로또 >> ★★★★★
		System.out.println("<LOTTO>");
		// Set<Integer> set = new HashSet<>(); 				// add한 요소들의 순서가 유지되지 않음
		/*
		 * HashSet으로 빙고 이용시 숫자 오름차순 정렬 증상
		 * - set의 특성상 입력 순서가 출력 순서와 같은 것은 아님(LinkedListHashSet은 같은)
		 * - 적은 데이터가 일률적으로 들어갈 시 오름차순 정렬 증상 발생
		 * - 로또의 경우 45개의 데이터 중 6개만을 입력하여 문제 x
		 * - 빙고의 경우 25개의 데이터 중 25개를 그대로 사용하여 증상 발생
		 */
		Set<Integer> set = new LinkedHashSet<Integer>();	// 사용하려는 범위가 작으면 자동으로 정렬을 하게 된다 범위가 클때만 정렬이 안된다
//		Set<Integer> set = new HashSet<>();					// add한 요소들의 순서가 유지됨
		
		while(set.size() < 6 ) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		
		int[] lotto = new int[6];							// 6 자리 배열 선언
		int i = 0;
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			lotto[i++] = itr.next();						// lotto 배열에 set에 들어있는 값을 넣어준다.
		}
		System.out.println(Arrays.toString(lotto));			// Arrays.toString(): 배열출력메소드
		set.clear(); 										// set 비우기 (초기화)

		
		// ★★★★★ << 빙고 >> ★★★★★
		System.out.println("\n<BINGO>");
		
		while(set.size() < 25) {			
			set.add((int)(Math.random()*200)+1);	
		}

		int[][] bingo = new int[5][5];						// 5행 5열 배열 생성

		itr = set.iterator();
		
		for(int i1=0; i1<bingo.length; i1++) {
			for(int j=0; j<bingo[i1].length; j++) {
				bingo[i1][j] = itr.next();
				System.out.print(bingo[i1][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
