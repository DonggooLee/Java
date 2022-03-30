package org.ddongq.test;

import java.util.Calendar;

/*
현재 날짜를 StringBuffer, Calendar 클래스를 이용하여
"2019년 10월 21일 월요일 오후 1시 10분" 과 같은 형식으로 완성하고 출력하시오.
StringBuffer.append() 이용
String[] weeks = {"","일","월","화","수","목","금","토"};
*/

public class Test07 {
	public static void main(String[] args) {
		
		String[] weeks = {"","일","월","화","수","목","금","토"};
		Calendar cal = Calendar.getInstance();
		StringBuffer sb = new StringBuffer();
		
		sb.append(cal.get(Calendar.YEAR) + "년 ");
		sb.append(cal.get(Calendar.MONTH) + 1 + "월 ");
		sb.append(cal.get(Calendar.DATE) + "일 ");
		sb.append(weeks[cal.get(Calendar.DAY_OF_WEEK)] + "요일 ");	// weeks 의 인덱스 위치가 해당 요일에 따라 자동으로 세팅
		if(cal.get(Calendar.AM_PM)==0) {
			sb.append("오전 ");
		}else {
			sb.append("오후 ");
		}
		sb.append(cal.get(Calendar.HOUR));
		sb.append("시 ");
		sb.append(cal.get(Calendar.MINUTE));
		sb.append("분 ");
		System.out.println(sb);
		
	}
}
