package org.ddongq.ex;

import java.util.Calendar;

public class Ex12_Dday {
	public static void main(String[] args) {
		
		Calendar date1 = Calendar.getInstance();	// 기념일
		Calendar date2 = Calendar.getInstance();	// 현재 날짜
		
		// date1을 기념일로 수정
		date1.set(2022, Calendar.NOVEMBER, 8);
		
		// 밀리초 단위로 계산하려면 long을 쓴다
		long elapseMilliSecond = date2.getTimeInMillis() - date1.getTimeInMillis();
		
		// 1000 밀리초 = 1초, 60초 = 1분, 60분 = 1시간, 24시간 = 1일
		long elapseSecond = elapseMilliSecond / 1000;
		long elapseDay	= elapseSecond / (60*60*24);
		
		System.out.println("D-day " + Math.abs(elapseDay) + "일 입니다.");
		
	}
}
