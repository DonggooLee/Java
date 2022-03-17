package org.ddongq.test;

public class Day {
	
	// 필드
	String schedule;
	
	// 생성자
	public Day() {

	}

	public Day(String schedule) {
		this.schedule = schedule;
	}
	
	// 메소드
	String getSchedule() {
		return schedule;
	}
	
	void setSchdule(String schedule){
		this.schedule = schedule;
	}
	
	void output() {
		if(schedule == null) {
			System.out.println("없음");
		}else {
			System.out.println(schedule);
		}
	}
	
}
