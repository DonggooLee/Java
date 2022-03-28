package org.ddongq.test;

interface Providable {
	void sightseeing();
	void leisure();
	void food();
}

class KoreaTour implements Providable {
	@Override
	public void sightseeing() {
		System.out.println("서울 구경");
	}
	@Override
	public void leisure() {
		System.out.println("부산 바나나보트 타기");
	}
	@Override
	public void food() {
		System.out.println("김치 요리");
	}
}

class GuamTour implements Providable {
	@Override
	public void sightseeing() {
		System.out.println("투몬 해변");
	}
	@Override
	public void leisure() {
		System.out.println("돌핀 크루즈");
	}
	@Override
	public void food() {
		System.out.println("초밥");
	}
}

class TourGuide {
	private Providable tour;
	
	public TourGuide(Providable tour) {
		this.tour = tour;
	}
	
	public void sightseeing() {
		tour.sightseeing();
	}
	public void leisure() {
		tour.leisure();
	}
	public void food() {
		tour.food();
	}
}


public class Test02 {
	public static void main(String[] args) {
		
		TourGuide guide = new TourGuide(new GuamTour());
		guide.sightseeing();
		guide.leisure();
		guide.food();
		
	}
}
