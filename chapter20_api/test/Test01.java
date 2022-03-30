package org.ddongq.test;

class Score {
	
	// 필드
	private int kor, mat, eng;
	// 생성자
	public Score(int kor, int mat, int eng) {
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	// 메소드
	@Override
	public String toString() {
		return "국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + mat;
	}
	@Override
	public boolean equals(Object obj) {	// 업캐스팅 = new Score(50, 30, 78)
		if(obj != null && obj instanceof Score) {	// 다운캐스팅 = 널 값이 아니고 스코어 타입으로 형변환이 가능하냐
			Score other = (Score)obj;		
			return kor==other.kor && eng==other.eng && mat==other.mat;
		}else {
			return false;
		}
	}
	
}

public class Test01 {
	public static void main(String[] args) {
		
		Score score1 = new Score(80, 70, 60);
		Score score2 = new Score(50, 30, 78);
		
		System.out.println("점수 1 : " + score1);			// toString이 없어도 출력이 가능!
		System.out.println("점수 2 : " + score2.toString());
		
		if(score1.equals(score2)) {	// 오버라이딩 된 equals 라는 점 인지!
			System.out.println("같은 점수");
		}else {
			System.out.println("다른 점수");
		}
		
	}
}
