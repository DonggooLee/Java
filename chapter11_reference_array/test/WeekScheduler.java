package org.ddongq.test;

import java.util.Scanner;

public class WeekScheduler {
	Day[] days;
	Scanner sc = new Scanner(System.in);
	String[] week = {"일","월","화","수","목","금","토"}; // 배열 선언과 동시에 초기화 이미 값을 알고있기때문에 
	
	public WeekScheduler() {
		days = new Day[7];
		for(int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	
	// 메소드
	void menu() {
		System.out.println("**************");
		System.out.println("1. 스케줄 생성");
		System.out.println("2. 스케줄 삭제");
		System.out.println("3. 스케줄 수정");
		System.out.println("4. 스케줄 보기");
		System.out.println("0. 스케줄 종료");
		System.out.println("**************");
	}
	
	void output() {
		System.out.println("<일주일의 전체 스케줄 출력>");
		for(int i=0; i<days.length; i++) {
			System.out.print(week[i] + "요일 스케줄 : ");
			days[i].output();
		}
	}
	
	void exit() {
		System.out.println("<스케줄러를 종료합니다>");
		sc.close();
		System.exit(0);
	}
	
	void run() {
		while(true) {
			menu();
			System.out.println("작업선택 : ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1: makeSchdule();
					break;
				case 2: removeSchdule();
					break;
				case 3: modifySchdule();
					break;
				case 4: output();
					break;
				case 0: exit();
					break;
				default : System.out.println("다시 입력하세요!");
			}
		}
	}
	
	void makeSchdule() {
		System.out.print("스케줄을 등록할 요일 선택 (일~토) : ");
		String weekday = sc.next();								// 1. 스케줄 생성 할 요일 입력받기
		
		for(int i=0; i<week.length; i++) {						// 2. 요일에 해당하는 스케줄 저장 위치 찾기
			if(weekday.equals(week[i])) {
			// 입력한 요일과 요일 배열내 값이 같으면
				if(days[i].getSchedule() == null) {				// 3. 해당 요일에 스케줄이 있는지 확인
				// 스케줄이 비어있으면 입력
					System.out.print("등록할 스케줄입력 : ");		// 4. 등록할 스케줄 입력
					String schedule = sc.next();
					days[i].setSchdule(schedule);				// 5. 스케줄을 days 배열 내 객체에 저장하기
				}else {
				// 이미 기존의 스케줄이 있으면
					System.out.println(week[i]+"요일에 이미 스케줄이 있습니다");
				}
			}
		}
	}
	
	void removeSchdule() {
		System.out.print("스케줄을 삭제할 요일 선택 (일~토) : ");
		String weekday = sc.next();								// 1. 스케줄 삭제 할 요일 입력받기
		
		for(int i=0;i<week.length;i++) {						// 2. 요일에 해당하는 스케줄 삭제 위치 찾기
			if(weekday.equals(week[i])) {
			// 입력한 요일과 요일 배열내 값이 같으면
				if(days[i].getSchedule() == null) {				// 3. 해당 요일에 스케줄이 있는지 확인
				// 스케줄이 비어있으면
					System.out.println(week[i]+"요일에는 삭제할 스케줄이 없습니다.");
				}else {
				// 이미 기존의 스케줄이 있으면
					days[i].setSchdule(null); 					// 4. null로 입력해서 빈값으로 만들기 
					System.out.println(week[i]+"요일에 스케줄을 삭제했습니다.");
				}
			}
		}
	}
	
	void modifySchdule() {
		System.out.print("스케줄을 수정할 요일 선택 (일~토) : ");
		String weekday = sc.next();								// 1. 스케줄 수정 할 요일 입력받기
		
		for(int i=0;i<week.length;i++) {						// 2. 요일에 해당하는 스케줄 수정 위치 찾기
			if(weekday.equals(week[i])) {
			// 입력한 요일과 요일 배열내 값이 같으면
				if(days[i].getSchedule() == null) {				// 3. 해당 요일에 스케줄이 있는지 확인
				// 스케줄이 비어있으면 
					System.out.println(week[i]+"요일에는 수정할 스케줄이 없습니다.");
					System.out.println("새 스케줄을 등록하시겠습니까? (yes/no) >> ");
					String yesOrNO = sc.next();
					
					if(yesOrNO.equalsIgnoreCase("yes")) {
						System.out.print("등록할 스케줄입력 : ");		
						String schedule = sc.next();
						days[i].setSchdule(schedule);			// 스케줄을 days 배열 내 객체에 저장하기
					}else {
						System.out.println("스케줄 변경 없다.");
					}
					
				}else {
				// 이미 기존의 스케줄이 있으면
					System.out.println(week[i]+"요일에 기존 스케줄을 변경합니다.");
					System.out.print("변경할 스케줄입력 : ");		// 4. 변경할 스케줄 입력
					String schedule = sc.next();
					days[i].setSchdule(schedule);				// 5. 변경한 스케줄을 days 배열 내 객체에 저장하기
				}
			}
		}
	}
	
	
}
